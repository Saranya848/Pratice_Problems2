package equation;
import java.util.*;
public class Quadratic {

	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
		Scanner bb = new Scanner(System.in);
		Scanner cc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = aa.nextInt();
		System.out.println("Enter b value: ");
		int b = bb.nextInt();
		System.out.println("Enter c value: ");
		int c = cc.nextInt();
		aa.close();
		bb.close();
		cc.close();

		double delta = b*b-4*a*c;
		if (delta > 0)   
		{  
		double x1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);  
		double x2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);  
		System.out.println("The roots of x are " + x1 + " and " + x2);  
		}   
		else if (delta == 0)   
		{  
		double x1 = -b / (2.0 * a);  
		System.out.println("The root is " + x1);  
		}   
		else   
		{  
		System.out.println("Roots are not real.");  
		} 
				
	}

}
