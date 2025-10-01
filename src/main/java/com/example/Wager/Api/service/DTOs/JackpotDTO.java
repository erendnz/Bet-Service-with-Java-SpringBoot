package com.example.Wager.Api.service.DTOs;

public class JackpotDTO {
	private Long id;
	private String name;
	private double currentSize;
	private int winCount;
	
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
	public String getLastWinTimestamp() {
		return lastWinTimestamp;
	}
	public void setLastWinTimestamp(String lastWinTimestamp) {
		this.lastWinTimestamp = lastWinTimestamp;
	}
	private String lastWinTimestamp;
}
