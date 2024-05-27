package api.domain.classes;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "author")
public class Author extends Person {

	@NotBlank
	@Column(name = "area_of_interest", unique = false, nullable = false)
	private String areaOfInterest;
	
	@NotBlank
	@Column(name = "biography", unique = false, nullable = false)
	private String biography;
	
	@NotNull
	@Column(name = "created_at", unique = false, nullable = false)
	private LocalDate createdAt;
	
	@NotNull
	@Column(name = "updated_at", unique = false, nullable = true)
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
