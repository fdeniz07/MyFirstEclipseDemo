package eCommerce.busimess.abstracts;

import eCommerce.entities.concrete.LoginDto;
import eCommerce.entities.concrete.User;

public interface AuthService {

	void register(User user);

	void verify(User user,String token);

	boolean userExists(String email);

	void login(LoginDto dto);

}
