
public class UserManager {
	
	public void signIn(String firstName,String lastName,String gender,String phone,String address,String userName,String password,String email) {
    	System.out.println(String.format("Sehr geehrte/r %d %d Ihre Registrierung wurde abgeschlossen.",firstName,lastName));
    }
	
    public void logIn(String email,String password) {
    	System.out.println(email+" wurde angemeldet");
    }
    
    public void logOut(String email,String password) {
    	System.out.println(email+" wurde abgemeldet.");
    }
    
    public void editProfile(String firstName,String lastName,String gender,String phone,String address,String userName,String password,String email) {
    	System.out.println("Ihr Profil wurde aktualisiert");
    }
}



