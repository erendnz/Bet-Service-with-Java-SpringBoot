package com.example.Wager.Api.controller;

import com.example.Wager.Api.service.BetService.BetService;
import com.example.Wager.Api.service.DTOs.BetDTO;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bets")
public class BetController {

    @Autowired
    private BetService betService;

    @PostMapping
    public ResponseEntity<String> placeBet(@RequestBody @Valid BetDTO dto) {
        betService.placeBet(dto.getJackpotId(), dto.getPlayerAlias(), dto.getAmount());
        return ResponseEntity.ok("Bet placed successfully");
    }
}