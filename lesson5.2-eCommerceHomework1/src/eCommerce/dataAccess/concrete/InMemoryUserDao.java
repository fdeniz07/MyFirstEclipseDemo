package eCommerce.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concrete.User;

public class InMemoryUserDao implements UserDao {

	private List<User> users = new ArrayList<User>();

	public InMemoryUserDao() {
		User user1 = new User(1, "Zafer", "Caliskan", "zafer@gmail,com", "123456", true);
		User user2 = new User(2, "Görkem", "Bilim", "gorkem@gmail,com", "123456", true);
		User user3 = new User(3, "Ali", "Caliskan", "ali@gmail,com", "123456", true);

		users.add(user1);
		users.add(user2);
		users.add(user3);
	}

	@Override
	public void add(User user) {
		System.out.println("Kaydedildi : " + user.getEmail());
		users.add(user);

	}

	@Override
	public void update(User user) {
		User userUpdate = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);

		userUpdate.setEmail(user.getEmail());
		userUpdate.setFirstName(user.getFirstName());
		userUpdate.setLastName(user.getLastName());
		userUpdate.setPassword(user.getPassword());
		userUpdate.setVerify(user.isVerify());
	}

	@Override
	public void delete(int userId) {
		User userToDelete = users.stream().filter(u -> u.getId() == userId).findFirst().orElse(null);
		users.remove(userToDelete);
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public User get(String email) {
		User user = users.stream().filter(u->u.getEmail()==email).findFirst().orElse(null);
		return user;
	}

}
