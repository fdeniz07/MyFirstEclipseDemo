package eCommerce.busimess.concrete;

import eCommerce.busimess.abstracts.AuthService;
import eCommerce.busimess.abstracts.UserService;
import eCommerce.core.util.Utils;
import eCommerce.entities.concrete.LoginDto;
import eCommerce.entities.concrete.User;

public class AutManager implements AuthService {

	private UserService userService;

	public AutManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if (userValidate(user) && passwordValidate(user.getPassword()) && !userExists(user.getEmail()) == false
				&& Utils.emailValidate(user.getEmail())) {
			userService.add(user);
		}
		System.out.println("Kayit basarisiz");
	}

	@Override
	public void verify(User user, String token) {
		if (user != null && token.length() > 20) {
			User exitUser = userService.get(user.getEmail());
			exitUser.setVerify(true);

			userService.update(exitUser);
			System.out.println("Dogrulandi");
		}

		System.out.println("Dogrulanmadi");

	}

	@Override
	public boolean userExists(String email) {
		User user = userService.get(email);

		if (user == null) {
			return true;
		} else {
			System.out.println("Email mevcut. " + email);
			return false;
		}

	}

	@Override
	public void login(LoginDto dto) {
		User user = userService.get(dto.getEmail());
		if (user != null && user.getPassword().equals(dto.getPassword())) {

			System.out.println("Basariyla giris yaptiniz");
		} else {
			System.out.println("Kullanici adi ya da sifre yanlis");
		}

	}

	public boolean userValidate(User user) { // kayit kriterleri

		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}
		return false;
	}

	public boolean passwordValidate(String password) { // pasword kriteri

		if (password.length() >= 6) {
			return true;
		}
		System.out.println("Sifreniz en az 6 karakter olmali");
		return false;
	}

}
