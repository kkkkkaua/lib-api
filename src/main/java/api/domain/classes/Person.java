package api.domain.classes;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@MappedSuperclass
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private long personId;
	
	@NotBlank
	@Size(min = 3)
	@Column(name = "name", unique = false, nullable = false)
	private String name;
	
	@NotNull
	@Column(name = "age", unique = false, nullable = false)
	private int age;
	
	@NotBlank
	@Column(name = "sex", unique = false, nullable = false)
	private String sex;
	
	@NotBlank
	@Column(name = "nationality", unique = false, nullable = false)
	private String nationality;
	
	public Person() {}
	
	public Person(String name, int age, String sex, String nationality) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.nationality = nationality;
	}
	
	public long getPersonId() {
		return personId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	public String getNationality() {
		return nationality;
	}
}
