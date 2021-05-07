package eCommerce.core;

import eCommerce.entities.concrete.LoginDto;

public interface ExternalAuthService {
	
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto);
	
}
