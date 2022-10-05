package se.albin.m5;

public class test {
	
	public static void main(String[] args) {
		Person person = new Person("Kalle", 18);
		Student student = new Student("Melvin", 22,"Fireman",10);
		
		student.setGrade(5);
		System.out.println(student.getAge());
		
		person.printInfo();
		System.out.print("\n");
		student.printInfo();
	}
	
}
