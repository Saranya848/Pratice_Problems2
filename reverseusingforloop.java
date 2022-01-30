package reversenum;

public class reverseusingforloop {

	public static void main(String[] args) {
		int num = 143;
		int result=0;
		int rev=0;
		for(;num != 0; num = num/10)   
		{  
		result = num % 10;  
		rev = rev * 10 + result;
		}
		System.out.println("Reverse number of digit is: " + rev);

	}

}
