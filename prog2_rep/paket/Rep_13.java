package paket;

import java.util.ArrayList;

public class Rep_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> number = new ArrayList<Double>();
		number.add(1.1);
		number.add(2.1);
		number.add(3.1);
		number.add(4.1);
		number.add(5.1);
		number.add(6.1);
		number.add(7.1);
		number.add(8.1);
		System.out.println(average(number));
	}
	
	public static double average(ArrayList<Double> arrayList) {
		double sum = 0;
		for (int i = 0 ; i < arrayList.size(); i ++) {
			sum = sum + arrayList.get(i);
		}
		return sum/arrayList.size();
	}

}
