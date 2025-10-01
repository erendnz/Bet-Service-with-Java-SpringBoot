package com.example.Wager.Api.repository;

import com.example.Wager.Api.entity.Jackpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JackpotRepository extends JpaRepository<Jackpot, Long> {
    
}