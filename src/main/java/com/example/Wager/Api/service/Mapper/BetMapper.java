package com.example.Wager.Api.service.Mapper;

import com.example.Wager.Api.entity.Bet;
import com.example.Wager.Api.service.DTOs.BetDTO;

import org.springframework.stereotype.Component;

@Component
public class BetMapper {

    public Bet toEntity(BetDTO dto) {
        Bet bet = new Bet();
        bet.setPlayerAlias(dto.getPlayerAlias());
        bet.setAmount(dto.getAmount());
        return bet;
    }
}