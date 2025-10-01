package com.example.Wager.Api.service.Mapper;

import org.springframework.stereotype.Component;

import com.example.Wager.Api.entity.Win;
import com.example.Wager.Api.service.DTOs.WinDTO;

@Component
public class WinMapper {

    public WinDTO toDTO(Win win) {
        WinDTO dto = new WinDTO();
        dto.setPlayerAlias(win.getPlayerAlias());
        dto.setWinAmount(win.getWinAmount());
        dto.setTimestamp(win.getTimestamp().toString());
        dto.setJackpotId(win.getJackpot().getId());
        dto.setJackpotName(win.getJackpot().getName());
        return dto;
    }
}