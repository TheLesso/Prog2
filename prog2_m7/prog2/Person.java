package prog2;

public class Person {
	private String name;
	private String socialSecurityNumber;


	public Person(String name, String number) {
		this.name = name;
		this.socialSecurityNumber = number;
	}
	
	public String toString() {
		return this.name;
	}
}
