package com.example.Wager.Api.service.DTOs;;

public class WinDTO {
	private String playerAlias;
	private double winAmount;
	private String timestamp;
	private Long jackpotId;
	
	public String getPlayerAlias() {
		return playerAlias;
	}
	public void setPlayerAlias(String playerAlias) {
		this.playerAlias = playerAlias;
	}
	public double getWinAmount() {
		return winAmount;
	}
	public void setWinAmount(double winAmount) {
		this.winAmount = winAmount;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Long getJackpotId() {
		return jackpotId;
	}
	public void setJackpotId(Long jackpotId) {
		this.jackpotId = jackpotId;
	}
	public String getJackpotName() {
		return jackpotName;
	}
	public void setJackpotName(String jackpotName) {
		this.jackpotName = jackpotName;
	}
	private String jackpotName;
}
