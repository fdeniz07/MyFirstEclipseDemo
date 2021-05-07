package Entities;

import Abstract.IEntity;

public class Order implements IEntity {
	private int id;
	private double totalAmount;
	private double amountToBePaid;

	public Order() {

	}

	public Order(int id, double totalAmount, double amountToBePaid) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
		this.amountToBePaid = amountToBePaid;
	}

	public void Oyuncu(Player player) {

		System.out.println(player.getFirstName() + " " + player.getLastName() + " : " + player.getEmail());

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getAmountToBePaid() {
		return amountToBePaid;
	}

	public void setAmountToBePaid(double amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}

}