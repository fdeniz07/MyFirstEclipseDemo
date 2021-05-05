package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Save to db : " + customer.firstName);
		
	}

}
