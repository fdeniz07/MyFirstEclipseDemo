package eCommerce.busimess.abstracts;

import java.util.List;

import eCommerce.entities.concrete.User;

public interface UserService {
	
	void add(User user);

	void update(User user);

	void delete(int userId);

	User get(String email);
	
	List<User> getAll();
}
