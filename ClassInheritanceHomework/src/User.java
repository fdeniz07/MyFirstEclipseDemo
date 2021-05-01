public class User {
	
	int id;
	String firstName;
	String lastName;
	String gender;
	String phone;
	String address;
	String userName;
	String password;
	String email;

	
	User() {

	}

	
	
	User(int id,String vorName,String nachName,String geschlect,String telefon,String adresse,String benutzerName,String kennwort,String email){
			   this();
			   this.id=id;
			   this.firstName=vorName;
			   this.lastName=nachName;
			   this.gender=geschlect;
			   this.phone=telefon;
			   this.address=adresse;
			   this.userName=benutzerName;
			   this.password=kennwort;
			   this.email=email;
		   }

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String vorName) {
		this.firstName = vorName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String nachName) {
		this.lastName = nachName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String geschlecht) {
		this.gender = geschlecht;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String telefon) {
		this.phone = telefon;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adresse) {
		this.address = adresse;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String benutzerName) {
		this.userName = benutzerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String kennwort) {
		this.password = kennwort;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
