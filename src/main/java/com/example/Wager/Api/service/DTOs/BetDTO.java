package com.example.Wager.Api.service.DTOs;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BetDTO {
	
	@NotNull(message = "Jackpot ID cannot be an empty")
    private Long jackpotId;
	
	@NotBlank(message = "Player Alias cannot be an empty")
	private String playerAlias;
	
    @DecimalMin(value = "0.01", message = "Bet should be at least 0.01")
    private double amount;

	public Long getJackpotId() {
		return jackpotId;
	}

	public void setJackpotId(Long jackpotId) {
		this.jackpotId = jackpotId;
	}

	public String getPlayerAlias() {
		return playerAlias;
	}

	public void setPlayerAlias(String playerAlias) {
		this.playerAlias = playerAlias;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}

