package oopHomework1;

public class Customer {
	int id;
	String firstName;
	String lastName;
	int age;
	String phone;

	public Customer() {
		System.out.println("Parametresiz calisan constructor'i calisdi");
	}

	public Customer(int id, String firstName, String lastName, int age, String phone) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}