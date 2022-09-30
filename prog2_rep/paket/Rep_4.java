package paket;

import java.util.Scanner;

public class Rep_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write your age:");
		int age = input.nextInt();
		
		if (age >= 35 && age <= 50) {
			System.out.println("Your middle aged");
		}
		else {
			System.out.println("Your not middle aged");
		}

	}

}
