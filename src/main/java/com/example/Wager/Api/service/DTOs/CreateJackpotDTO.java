package com.example.Wager.Api.service.DTOs;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public class CreateJackpotDTO {
	@NotBlank(message = "Jackpot name cannot be null")
	private String name;
	
	@DecimalMin(value = "0.0", inclusive = true, message = "Win probability cannot be lower than 0.0")
    @DecimalMax(value = "1.0", inclusive = true, message = "Win probability cannot be lower than 1.0")
	private double winProbability;

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
}
