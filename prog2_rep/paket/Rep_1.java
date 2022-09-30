package paket;

import java.util.Scanner;

public class Rep_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(add(input.nextInt(), input.nextInt()));
	}
	
	static int add(int number1, int number2) {
		return number1 + number2;
	}

}
