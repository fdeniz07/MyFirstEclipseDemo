package eCommerce;

import java.util.List;

import eCommerce.busimess.concrete.AutManager;
import eCommerce.busimess.concrete.UserManager;
import eCommerce.core.amazonEmail.AmazonMailManagerAdapter;
import eCommerce.core.googleEmail.GoogleMailManagerAdapter;
import eCommerce.dataAccess.concrete.InMemoryUserDao;
import eCommerce.entities.concrete.User;

public class Main {

	public static void main(String[] args) {

		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		AutManager authManager = new AutManager(new UserManager(new InMemoryUserDao(), new AmazonMailManagerAdapter()));
		
		User user1 = new User(1, "Fatih", "Deniz", "fatih@gmail.com", "123456", true);
		User user2 = new User(2, "Mehmet", "Kahraman", "mehmet@gmail.com", "123456", true);
		authManager.register(user1);

		UserManager userManager = new UserManager(inMemoryUserDao, new GoogleMailManagerAdapter());
		//userManager.add(user1);
		//List<User> all = userManager.getAll();
		userManager.getAll();
		//userManager.update(user2);
		//userManager.delete(3);
	}

}
