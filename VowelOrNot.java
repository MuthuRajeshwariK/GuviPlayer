import java.util.Scanner;

public class VowelOrNot {

	
	public static void main(String[] args) {
		System.out.println("Enter a character:");
		Scanner s=new Scanner(System.in);
		String ch=s.next();
		switch(ch)
		{
		case "a":
			System.out.println("Vowel");
			break;
		case "e":
			System.out.println("Vowel");
			break;
		case "i":
			System.out.println("Vowel");
			break;
		case "o":
			System.out.println("Vowel");
			break;
		case "u":
			System.out.println("Vowel");
			break;
		default:
			System.out.println("consonant");
		}
		s.close();
	}

}
