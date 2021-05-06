package Entities;

import Abstract.IEntity;

public class Game implements IEntity {

	private int id;
	private int playerId;
	private String name;
	private String gameType;
	private double price;
	private int campaignId;
	
	public Game() {
		
	}

	public Game(int id, int playerId, String name,String gameType, double price, int campaignId) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.name = name;
		this.gameType = gameType;
		this.price = price;
		this.campaignId = campaignId;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
}
