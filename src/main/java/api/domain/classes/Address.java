package api.domain.classes;

import api.domain.enums.StreetType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class Address {

	private int streetNumber;
	private String streetName;
	
	@Enumerated(EnumType.STRING)
	private StreetType streetType;
	private String city;
	private String state;
	private String postalCode;
	
	public Address(int streetNumber, String streetName, StreetType streetType, String city, String state,
			String postalCode) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.streetType = streetType;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
	public int getStreetNumber() {
		return streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public StreetType getStreetType() {
		return streetType;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getPostalCode() {
		return postalCode;
	}
}
