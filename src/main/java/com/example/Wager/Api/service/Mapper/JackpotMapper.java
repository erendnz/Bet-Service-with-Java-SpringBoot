package com.example.Wager.Api.service.Mapper;

import org.springframework.stereotype.Component;

import com.example.Wager.Api.entity.Jackpot;
import com.example.Wager.Api.service.DTOs.CreateJackpotDTO;
import com.example.Wager.Api.service.DTOs.JackpotDTO;

@Component
public class JackpotMapper {

    public Jackpot toEntity(CreateJackpotDTO dto) {
        Jackpot jackpot = new Jackpot();
        jackpot.setName(dto.getName());
        jackpot.setWinProbability(dto.getWinProbability());
        return jackpot;
    }

    public JackpotDTO toResponseDTO(Jackpot jackpot) {
        JackpotDTO dto = new JackpotDTO();
        dto.setId(jackpot.getId());
        dto.setName(jackpot.getName());
        dto.setCurrentSize(jackpot.getCurrentSize());
        dto.setWinCount(jackpot.getWinCount());
        dto.setLastWinTimestamp(jackpot.getLastWinTimestamp() != null
            ? jackpot.getLastWinTimestamp().toString()
            : null);
        return dto;
    }
}