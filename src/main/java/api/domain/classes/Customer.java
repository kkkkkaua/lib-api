package api.domain.classes;

public class Customer extends Person {

	private Address address;
	private String personalIdentificationNumber;
	
	public Customer() {}
	
	public Customer(Address address, String personalIdentificationNumber) {
		this.address = address;
		this.personalIdentificationNumber = personalIdentificationNumber;
	}

	public Address getAddress() {
		return address;
	}

	public String getPersonalIdentificationNumber() {
		return personalIdentificationNumber;
	}
}
