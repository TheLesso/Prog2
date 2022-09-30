package paket;

import java.util.HashMap;
import java.util.Scanner;

public class Rep_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		HashMap<String, String> book = new HashMap<>();
		book.put("0123456789121", "harry potter and the philsophers stone");
		book.put("0123456789122", "harry potter and the chamber of secrets");
		book.put("0123456789123", "harry potter and the prisoner from azkaban");
		book.put("0123456789124", "harry potter and the goblet of fire");
		
		
		System.out.println("Write the ISBN for the book you want:");
		
		String isbn = input.nextLine();
		if (book.get(isbn) == null) {
			System.out.println("That number doesn't exists");
			return;
		}
		System.out.println("ISBN: " + isbn + "\nBook: " + book.get(isbn));
		
	}

}
