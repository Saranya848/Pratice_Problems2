package checking1;
import java.util.*;
public class Checkingcharater {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=scan1.next().charAt(0);
		scan1.close();
		boolean isVowel=false;
		switch(ch)
		{
		   case 'a' : isVowel = true;
		   break;
		   case 'e' : isVowel = true;
		   break;
	       case 'i' : isVowel = true;
		   break;
		   case 'o' : isVowel = true;
		   break;
		   case 'u' : isVowel = true;
		   break;
		   case 'A' : isVowel = true;
		   break;
		   case 'E' : isVowel = true;
		   break;
		   case 'I' : isVowel = true;
		   break;
		   case 'O' : isVowel = true;
		   break;
		   case 'U' :  isVowel = true;
		   break;
		}
		if(isVowel == true) {
		   System.out.println(ch+ " is a Vowel");
		}
		else {
		   if((ch >= 'a' && ch<='z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println(ch+ " is a Consonant");
		   else
			System.out.println("Input is not an alphabet");		
	        }

	}

}
