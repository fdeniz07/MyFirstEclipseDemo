package eCommerce.core.amazonEmail;

import eCommerce.amazonEmail.AmazonMailManager;
import eCommerce.core.EmailService;

public class AmazonMailManagerAdapter implements EmailService{
	
	
private AmazonMailManager amazonMailManager;


	public AmazonMailManagerAdapter() {
		super();
		this.amazonMailManager = new AmazonMailManager();
	}

	
	
	@Override
	public void send(String email, String message) {
		amazonMailManager.send(email, message);
		
	}

}
