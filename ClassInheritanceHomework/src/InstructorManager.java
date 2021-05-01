
public class InstructorManager extends UserManager {
	
	public void updateProfile(String firstName, String lastName, String gender, String phone, String address,
			String userName, String password, String email, String department, String birthDay, int experience) {
		
		System.out.println(String.format("%d %d Ihr Profil wurde bearbeitet. ", firstName, lastName));
	}
}
