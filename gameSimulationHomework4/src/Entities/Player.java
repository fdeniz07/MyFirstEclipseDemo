package Entities;

import Abstract.IEntity;

public class Player implements IEntity{
	private int id;
	private Long nationalIdentity;
	private int birthYear;
	private String firstName;
	private String lastName;
	private double wallet;
	private String email;

	
	public Player() {
		
	}
	
	public Player(int id, Long nationalIdentity, int birthYear, String firstName, String lastName, double wallet, String email) {
		this.id = id;
		this.nationalIdentity = nationalIdentity;
		this.birthYear = birthYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email=email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(Long nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getWallet() {
		return wallet;
	}

	public void setWallet(double wallet) {
		this.wallet = wallet;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
