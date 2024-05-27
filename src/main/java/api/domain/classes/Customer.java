package api.domain.classes;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer extends Person {

	@Embedded
	@NotNull
	private Address address;
	
	@NotBlank
	@Size(min = 11)
	@Column(name = "personal_number", unique = true, nullable = false)
	private String personalIdentificationNumber;
	
	public Customer() {}
	
	public Customer(String name, int age, String sex, String nationality, Address address,
			String personalIdentificationNumber) {
		super(name, age, sex, nationality);
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
