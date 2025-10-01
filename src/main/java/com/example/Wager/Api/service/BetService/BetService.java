package com.example.Wager.Api.service.BetService;

import com.example.Wager.Api.entity.Jackpot;
import com.example.Wager.Api.entity.Bet;

public interface BetService {
    Bet placeBet(Long jackpotId, String playerAlias, double amount);
}