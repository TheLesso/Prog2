package paket;

import java.util.Scanner;

public class Rep_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write your length in cm");
		int length = input.nextInt();
		if (length>200) {
			System.out.println("Your a basketball player");
		}
		else if (length<200) {
			System.out.println("Short");
		}
	}

}
