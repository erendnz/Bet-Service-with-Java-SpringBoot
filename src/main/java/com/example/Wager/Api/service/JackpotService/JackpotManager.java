package com.example.Wager.Api.service.JackpotService;

import com.example.Wager.Api.entity.Jackpot;
import com.example.Wager.Api.repository.JackpotRepository;
import com.example.Wager.Api.service.DTOs.CreateJackpotDTO;
import com.example.Wager.Api.service.DTOs.JackpotDTO;
import com.example.Wager.Api.service.Mapper.JackpotMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JackpotManager implements JackpotService {

    @Autowired
    private JackpotRepository jackpotRepository;
    
    @Autowired
    private JackpotMapper jackpotMapper;

    @Override
    public JackpotDTO createJackpot(CreateJackpotDTO dto) {
        Jackpot jackpot = jackpotMapper.toEntity(dto);
        Jackpot saved = jackpotRepository.save(jackpot);
        return jackpotMapper.toResponseDTO(saved);
    }

    @Override
    public List<JackpotDTO> getAllJackpots() {
        return jackpotRepository.findAll()
                .stream()
                .map(jackpotMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Jackpot getJackpotById(Long id) {
        return jackpotRepository.findById(id).orElse(null);
    }
}
