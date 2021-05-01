
public class Main {

	public static void main(String[] args) {

		Student schueler1 = new Student();

		schueler1.setId(1);
		schueler1.setFirstName("David");
		schueler1.setLastName("Kurzmann");
		schueler1.setGender("Mann");
		schueler1.setPhone("0049 176589 6547");
		schueler1.setAddress("Berliner Platz 56,58095 Hagen");
		schueler1.setUserName("d@v1D");
		schueler1.setPassword("1234");
		schueler1.setEmail("davkur@gmx.de");
		schueler1.setCourse("Java Bildung");
		schueler1.setAbout("Ich bin David Kurzmann.Ich lebe in Deutschland. Mein Beruf ist Software Entwickler");

		StudentManager schuelerVerwaltung = new StudentManager();
		schuelerVerwaltung.editProfile(schueler1.getFirstName(), schueler1.getLastName(), schueler1.getGender(),
				schueler1.getPhone(), schueler1.getAddress(), schueler1.getUserName(), schueler1.getPassword(),
				schueler1.getEmail(), schueler1.getCourse(), schueler1.getAbout());

		schuelerVerwaltung.logOut(schueler1.getEmail(), schueler1.getPassword());

		Instructor lehrer1 = new Instructor();
		lehrer1.setId(1);
		lehrer1.setFirstName("George");
		lehrer1.setLastName("Löwe");
		lehrer1.setGender("Mann");
		lehrer1.setPhone("0049 151 149 4578");
		lehrer1.setAddress("Frankfurter Straße 116,62090 Bonn");
		lehrer1.setUserName("georgeBonn");
		lehrer1.setPassword("12345");
		lehrer1.setEmail("george.loewe@gmx.de");
		lehrer1.setDepartment("Bildung");
		lehrer1.setBirthDay("10.01.1985");
		lehrer1.setExperience(5);

		InstructorManager lehrerVerwaltung = new InstructorManager();
		lehrerVerwaltung.logIn(lehrer1.getEmail(), lehrer1.getPassword());

	}

}
/*
 * public void editProfile(String firstName, String lastName, String gender,
 * String phone, String address, String userName, String password, String email,
 * String course, String about) {}
 */