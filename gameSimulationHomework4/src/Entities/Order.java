package Entities;

import Abstract.IEntity;

public class Order implements IEntity{
	private int id;
	private String player;
	private String game;
	private int campaignId;
	private double totalAmount;
	private boolean isCampaignActive;
	private double discount;
	private double amountToBePaid;
	//private Order order;
	
	public Order() {

	}

	public Order(int id, String player, String game, int campaignId, double totalAmount, double discount,double amountToBePaid,boolean isCampaignActive) {
		this.id = id;
		this.player = player;
		this.game = game;
		this.campaignId = campaignId;
		this.totalAmount = totalAmount;
		this.discount = discount;
		this.amountToBePaid = amountToBePaid;
		this.isCampaignActive= isCampaignActive;
	}

	
	  public void Oyuncu(Player player) {
	  
	  System.out.println(player.getFirstName() + player.getEmail());
	  
	  }
	 
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPlayer() {
		return player;
	}


	public void setPlayer(String player) {
		this.player = player;
	}


	public String getGame() {
		return game;
	}


	public void setGame(String game) {
		this.game = game;
	}


	public int getCampaignId() {
		return campaignId;
	}


	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public boolean isCampaignActive() {
		return isCampaignActive;
	}


	public void setCampaignActive(boolean isCampaignActive) {
		this.isCampaignActive = isCampaignActive;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getAmountToBePaid() {
		return amountToBePaid;
	}


	public void setAmountToBePaid(double amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}


}