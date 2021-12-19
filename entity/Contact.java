package entity;

public class Contact {
	String firstName, lastName, address, city, state, emailId;
	long zip, phoneNumber;

	public Contact(String firstName, String lastName, String address, String city, String state, String emailId,
			long zip, long phoneNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.emailId = emailId;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

public Contact() {
	this.firstName = "";
	this.lastName = "";
	this.address = "";
	this.city = "";
	this.state = "";
	this.emailId = "";
	this.phoneNumber = 0000000000;
	this.zip = 000000;
}
// Method in that we can add,update,delete contact details
public void creatContact() {
	
}
	public String printContact() {
		System.out.println("Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", email=" + emailId + ", phoneNumber=" + phoneNumber + ", zip=" + zip + "]");	
	return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", email=" + emailId + ", phoneNumber=" + phoneNumber + ", zip=" + zip + "]";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
