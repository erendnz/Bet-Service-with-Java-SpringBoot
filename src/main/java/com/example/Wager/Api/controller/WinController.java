package com.example.Wager.Api.controller;

import com.example.Wager.Api.service.DTOs.WinDTO;
import com.example.Wager.Api.service.Mapper.WinMapper;
import com.example.Wager.Api.service.WinService.WinService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/wins")
public class WinController {

    @Autowired
    private WinService winService;

    @Autowired
    private WinMapper winMapper;

    @GetMapping
    public List<WinDTO> getAllWins() {
        return winService.getAllWins()
                .stream()
                .map(winMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/player")
    public List<WinDTO> getWinsByPlayer(@RequestParam String playerAlias) {
        return winService.getWinsByPlayer(playerAlias)
                .stream()
                .map(winMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/limit")
    public List<WinDTO> getLimitedWins(@RequestParam int limit) {
        return winService.getLimitedWins(limit)
                .stream()
                .map(winMapper::toDTO)
                .collect(Collectors.toList());
    }
}