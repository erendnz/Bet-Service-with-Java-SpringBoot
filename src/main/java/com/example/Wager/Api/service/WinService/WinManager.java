package com.example.Wager.Api.service.WinService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Wager.Api.entity.Win;
import com.example.Wager.Api.repository.WinRepository;

@Service
public class WinManager implements WinService {

    @Autowired
    private WinRepository winRepository;

    @Override
    public List<Win> getAllWins() {
        return winRepository.findAll();
    }

    @Override
    public List<Win> getWinsByPlayer(String playerAlias) {
        return winRepository.findByPlayerAlias(playerAlias);
    }

    @Override
    public List<Win> getLimitedWins(int limit) {
        return winRepository.findAll().stream().limit(limit).toList();
    }
}