
public class Student extends User{
	
	String course;
	String about;

	
	Student() {

	}

	
	Student(String kurs, String ueberMich) {
		this();
		this.course = kurs;
		this.about = ueberMich;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String kurs) {
		this.course = kurs;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String ueberMich) {
		this.about =ueberMich;
	}
}
