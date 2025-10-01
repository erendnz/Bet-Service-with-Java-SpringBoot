package com.example.Wager.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Wager.Api.entity.Win;

import java.util.List;

@Repository
public interface WinRepository extends JpaRepository<Win, Long> {
    List<Win> findByPlayerAlias(String playerAlias); 
}
