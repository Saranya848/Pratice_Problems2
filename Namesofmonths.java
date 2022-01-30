package month;

import java.util.Scanner;

public class Namesofmonths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Number : ");
	    int N = sc.nextInt();
	    sc.close();
		switch(N)
		{
        case 1:  System.out.println(N + " is January month");
        break;
        case 2:  System.out.println(N + " is February month");
        break;
        case 3:  System.out.println(N + " is March month");
        break;
        case 4:  System.out.println(N + " is April month");
        break;
        case 5:  System.out.println(N + " is May month");
        break;
        case 6:  System.out.println(N + " is June month");
        break;
        case 7:  System.out.println(N + " is July month");
        break;
        case 8:  System.out.println(N + " is August month");
        break;
        case 9:  System.out.println(N + " is September month");
        break;
        case 10: System.out.println(N + " is October month");
        break;
        case 11: System.out.println(N + " is November month");
        break;
        case 12: System.out.println(N + " is December month");
        break;
        default: System.out.println(N + " is Invalid month month");
        break;
		}

	}
	
}
