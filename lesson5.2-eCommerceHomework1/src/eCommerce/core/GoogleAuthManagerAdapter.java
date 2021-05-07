package eCommerce.core;

import eCommerce.busimess.abstracts.UserService;
import eCommerce.dataAccess.concrete.InMemoryUserDao;
import eCommerce.entities.concrete.LoginDto;
import eCommerce.entities.concrete.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService{
	
	
	private UserService userService;

	
		public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@Override
	public void register(String email) {
		if(userExists(email)==false) {
			userService.add(null);
		}
		else {
			User user = userService.get(email);
			
			LoginDto dto = new LoginDto();
			dto.setEmail(user.getEmail());
			dto.setPassword(user.getPassword());
			
			login(dto);
		}
		
	}

	@Override
	public boolean userExists(String email) {
		if (userService.get(email)!=null) {
			return true;
		}
		return false;
	}

	
	//dto!=null && 
	@Override
	public void login(LoginDto dto) {
		if (dto!=null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("Basariyla giris yaptiniz.");
		}else {
			System.out.println("Kullanici adi ya da sifre yanlis");
		}
		
	}



}
