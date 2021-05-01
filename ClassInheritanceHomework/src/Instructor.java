
public class Instructor  extends User{
	
	String department;
	String birthDay;
	int experience;
	
	
	public Instructor() {

	}
	
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String abTeilung) {
		this.department = abTeilung;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String geburtsTag) {
		this.birthDay = geburtsTag;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int erfahrung) {
		this.experience = erfahrung;
	}
}
