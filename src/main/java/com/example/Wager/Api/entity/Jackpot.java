package com.example.Wager.Api.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "jackpots")
public class Jackpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double winProbability;

    private double currentSize = 0.0;

    private int winCount = 0;

    private LocalDateTime lastWinTimestamp;

    public Jackpot() {}

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWinProbability() {
		return winProbability;
	}

	public void setWinProbability(double winProbability) {
		this.winProbability = winProbability;
	}

	public double getCurrentSize() {
		return currentSize;
	}

	public void setCurrentSize(double currentSize) {
		this.currentSize = currentSize;
	}

	public int getWinCount() {
		return winCount;
	}

	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}

	public LocalDateTime getLastWinTimestamp() {
		return lastWinTimestamp;
	}

	public void setLastWinTimestamp(LocalDateTime lastWinTimestamp) {
		this.lastWinTimestamp = lastWinTimestamp;
	}

	public Jackpot(String name, double winProbability) {
        this.name = name;
        this.winProbability = winProbability;
    }
}