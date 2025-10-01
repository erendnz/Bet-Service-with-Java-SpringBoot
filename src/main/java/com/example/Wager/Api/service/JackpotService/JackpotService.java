package com.example.Wager.Api.service.JackpotService;

import java.util.List;

import com.example.Wager.Api.entity.Jackpot;
import com.example.Wager.Api.service.DTOs.CreateJackpotDTO;
import com.example.Wager.Api.service.DTOs.JackpotDTO;

public interface JackpotService {
	JackpotDTO createJackpot(CreateJackpotDTO dto);
    List<JackpotDTO> getAllJackpots();
    Jackpot getJackpotById(Long id);
}