package eCommerce.busimess.concrete;

import java.util.List;

import eCommerce.busimess.abstracts.UserService;
import eCommerce.core.EmailService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concrete.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailService emailService;

	public UserManager(UserDao userDao, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}

	@Override
	public void add(User user) {

		if (userValidate(user)) {
			userDao.add(user);

			emailService.send(user.getEmail(), "Basarili kayit olundu");
		}

	}

	@Override
	public void update(User user) {
		if (userValidate(user)) {
			userDao.update(user);
		}

	}

	@Override
	public void delete(int userId) {
		userDao.delete(userId);

	}

	@Override
	public User get(String email) {

		return userDao.get(email);

	}

	@Override
	public List<User> getAll() {

		for (User user : userDao.getAll()) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getEmail());
		}
		return userDao.getAll();
	}

	public boolean userValidate(User user) {
		if (user.getFirstName().length() > 3 && user.getLastName().length() > 2) {
			return true;
		}
		System.out.println("Ad ve Soyad en az 3 karakter olmalidir. ");
		return false;
	}

}
