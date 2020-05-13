package entities;

public class User {
	int id;
	String lastName,
		firstName,
		email,
		password,
		usertype;
	Address shipAddress;
	
	public User() {}
	
	public User(int id, String lastName, String firstName, String email,
			String password, String usertype , Address shipAddress) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.usertype=usertype;
		this.shipAddress = shipAddress;
		
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsertype() {
		return usertype;
	}
	public Address getShipAddress() {
		return shipAddress;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	public void setShipAdress(Address adress) {
		this.shipAddress = adress;
	}
}
