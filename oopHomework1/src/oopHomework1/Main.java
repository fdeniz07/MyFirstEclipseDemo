package oopHomework1;

public class Main {

	public static void main(String[] args) {
		
			Employee employee1 = new Employee(1,"Sebastian","Müller",36,"0049 1764526598");
			Employee employee2 = new Employee(2,"Tobias","Kuhn",23,"0049 1523654122");
			Employee employee3 = new Employee();

			Customer customer1 = new Customer(1,"Marcus","Maxmillian",21,"0049 1624656595");
			Customer customer2 = new Customer(2,"Jürgen","Bock",42,"0049 1512587447");
			Customer customer3 = new Customer();
			
			
			Employee[] employees= {employee1,employee2};
			for (Employee employee:employees) {
				System.out.println(employee.firstName);
			}
			
			Customer[] customers= {customer1,customer2};
			for (Customer customer:customers) {
				System.out.println(customer.firstName);
			}

			
			EmployeeManager employeeManager = new EmployeeManager();
			employeeManager.addToList(employee1);
			employeeManager.addToList(employee2);
		
			CustomerManager customerManager = new CustomerManager();
			customerManager.addToList(customer1);
			customerManager.addToList(customer2);
			
			
	}

}
