package com.example.Wager.Api.service.BetService;

import com.example.Wager.Api.entity.Bet;
import com.example.Wager.Api.entity.Jackpot;
import com.example.Wager.Api.entity.Win;
import com.example.Wager.Api.repository.BetRepository;
import com.example.Wager.Api.repository.JackpotRepository;
import com.example.Wager.Api.repository.WinRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class BetManager implements BetService {

    @Autowired
    private BetRepository betRepository;

    @Autowired
    private JackpotRepository jackpotRepository;

    @Autowired
    private WinRepository winRepository;

    private final Random random = new Random();

    @Override
    public Bet placeBet(Long jackpotId, String playerAlias, double amount) {
        Jackpot jackpot = jackpotRepository.findById(jackpotId).orElseThrow(() -> new RuntimeException("Jackpot not found"));

        Bet bet = new Bet(playerAlias, amount, jackpot);
        betRepository.save(bet);

        // Add tojackpot
        jackpot.setCurrentSize(jackpot.getCurrentSize() + amount);

        // Winning probability check
        boolean isWin = random.nextDouble() < jackpot.getWinProbability();
        if (isWin) {
            double winAmount = jackpot.getCurrentSize();

            // Save win
            Win win = new Win(playerAlias, winAmount, jackpot);
            winRepository.save(win);

            jackpot.setWinCount(jackpot.getWinCount() + 1);
            jackpot.setLastWinTimestamp(LocalDateTime.now());
            jackpot.setCurrentSize(0.0);
        }

        jackpotRepository.save(jackpot);
        return bet;
    }
}
