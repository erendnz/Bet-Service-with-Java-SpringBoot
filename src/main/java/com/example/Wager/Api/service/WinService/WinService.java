package com.example.Wager.Api.service.WinService;

import java.util.List;

import com.example.Wager.Api.entity.Win;

public interface WinService {
    List<Win> getAllWins();
    List<Win> getWinsByPlayer(String playerAlias);
    List<Win> getLimitedWins(int limit);
}