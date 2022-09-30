package paket;

import java.util.Scanner;

public class Rep_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write to numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int sum = 0;
		try {
			sum = num1 / num2;
		} catch (Exception e) {
			System.out.println("Can't divide by zero");
			return;
		}

		System.out.println(sum);
	}

}
