package sumofdigit;

public class Sumusingforloop {

	public static void main(String[] args) {
		int num = 5;
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of the digits:  " + sum);

	}

}
