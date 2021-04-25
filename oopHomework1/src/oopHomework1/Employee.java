package oopHomework1;

public class Employee {
	int id;
	String firstName;
	String lastName;
	int age;
	String phone;

	public Employee() {
		System.out.println("Parametresiz müsteri constructor'i calisdi");
	}

	public Employee(int id, String firstName, String lastName, int age, String phone) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}

