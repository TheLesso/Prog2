package prog2;

public class Car<O> {
	private O owner;
	private String reg;

	public Car(O owner, String reg) {
		this.owner = owner;
		this.reg = reg;
	}

	public O getOwner() {
		return owner;
	}

	public static void main(String[] args) {
		Car<String> car1 = new Car<String>("Lisa O-son", "REG 123");
		Car<Person> car2 = new Car<Person>(new Person("Kalle J:son", "040404-1234"), "PEG 669");
		System.out.println(car1.getOwner());
		System.out.println(car2.getOwner());
		
	}
}
