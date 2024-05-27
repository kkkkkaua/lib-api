package api.domain.classes;

public class Person {

	private long personId;
	private String name;
	private int age;
	private String sex;
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
