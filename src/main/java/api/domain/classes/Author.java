package api.domain.classes;

import java.time.LocalDate;

public class Author extends Person {

	private String areaOfInterest;
	private String biography;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	
	public Author() {}
	
	public Author(String name, int age, String sex, String nationality, String areaOfInterest, String biography) {
		super(name, age, sex, nationality);
		this.areaOfInterest = areaOfInterest;
		this.biography = biography;
		this.createdAt = LocalDate.now();
		this.updatedAt = null;
	}

	public String getAreaOfInterest() {
		return areaOfInterest;
	}

	public String getBiography() {
		return biography;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}
}
