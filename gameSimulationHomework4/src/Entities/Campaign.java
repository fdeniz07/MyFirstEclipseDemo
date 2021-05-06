package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Campaign implements IEntity{
	private int id;
	private String name;
	private String description;
	private LocalDate campaignStartDate;
	private LocalDate campaignEndDate;
	private double discount;
	private boolean campaignStatus;

	public Campaign() {

	}

	public Campaign(int id, String name, String description, LocalDate campaignStartDate, LocalDate campaignEndDate,double discount,boolean campaignStatus) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.campaignStartDate = campaignStartDate;
		this.campaignEndDate = campaignEndDate;
		this.discount = discount;
		this.campaignStatus= campaignStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getCampaignStartDate() {
		return campaignStartDate;
	}

	public void setCampaignStartDate(LocalDate campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}

	public LocalDate getCampaignEndDate() {
		return campaignEndDate;
	}

	public void setCampaignEndDate(LocalDate campaignEndDate) {
		this.campaignEndDate = campaignEndDate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public boolean isCampaignStatus() {
		return campaignStatus;
	}

	public void setCampaignStatus(boolean campaignStatus) {
		this.campaignStatus = campaignStatus;
	}

}
