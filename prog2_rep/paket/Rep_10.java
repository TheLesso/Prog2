package paket;

import java.util.Scanner;

public class Rep_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a temp in farenheit");
		int temp = input.nextInt();
		System.out.println(tempConvert(temp));
	}
	public static double tempConvert(double temp) {
		return (temp-32)/1.8;
	}

}
