package com.example.Wager.Api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Wager.Api.service.DTOs.CreateJackpotDTO;
import com.example.Wager.Api.service.DTOs.JackpotDTO;
import com.example.Wager.Api.service.JackpotService.JackpotService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/jackpots")
public class JackpotController {

    @Autowired
    private JackpotService jackpotService;

    @PostMapping
    public JackpotDTO createJackpot(@RequestBody @Valid CreateJackpotDTO dto) {
        return jackpotService.createJackpot(dto);
    }

    @GetMapping
    public List<JackpotDTO> getAllJackpots() {
        return jackpotService.getAllJackpots();
    }
}
