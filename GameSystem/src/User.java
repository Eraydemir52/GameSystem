
public class User {
	int id;
	String nationaltyId;
	String firstName;
	String lastName;
	int birthDate;
	public User() {
		
	}
	public User(int id, String nationaltyId, String firstName, String lastName, int birthDate) {
		
		this.id = id;
		this.nationaltyId = nationaltyId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationaltyId() {
		return nationaltyId;
	}
	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	
	

}
