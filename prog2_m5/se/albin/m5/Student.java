package se.albin.m5;

public class Student extends Person {
	private String education;
	private int grade;

	public Student(String name, int age, String education, int grade) {
		super(name, age);
		this.education = education;
		this.grade = grade;
		
	}
	
	public void setGrade(int grade){
 	    this.grade = grade;
	}
	
	/** Åtkomstmetod, get-metod */
	public int getGrade(){
 	    return this.grade;
	}
	
	public void printInfo(){
 	    super.printInfo();
 	    System.out.println("Education: " + education);
 	    System.out.println("Grade: " + grade);
	}

}
