package paket;

public class Rep_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min(3,3));
	}
	
	public static int min(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		}
		else if (num1==num2) {
			return num1;
		}
		else {
			return num2;
		}
	}

}
