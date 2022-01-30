package digitsum;
import java.util.*;
public class Sumofnum {

	public static void main(String[] args) {
		System.out.println("Enter size number to be: ");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		n.close();
		System.out.println("Enter numbers: ");
		Scanner p1 = new Scanner(System.in);
		int p = p1.nextInt();
		p1.close();
		int sum = 0;
		int i=1;
		while(i <= num)
		{

				  sum = sum + p;
				  i = i + 1;
		}
		System.out.println("The sum of the digits:  " + sum);

	}

}
