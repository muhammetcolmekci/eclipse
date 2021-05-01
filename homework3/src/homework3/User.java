package homework3;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdenty;
	
	public User() {
		
		
	}
	public User(int id, String firstName, String lastName, String nationalIdenty) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdenty = nationalIdenty;
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
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdenty() {
		return nationalIdenty;
	}
	public void setNationalIdenty(String nationalIdenty) {
		this.nationalIdenty = nationalIdenty;
	}
	
	
	

}
