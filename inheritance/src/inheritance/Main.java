package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		unionCustomer abc = new unionCustomer();
		abc.customerNumber="99999";
		
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {engin,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}
