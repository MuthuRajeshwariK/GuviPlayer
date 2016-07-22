import java.util.Scanner;

public class StringToInteger {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=s.next();
		switch (str) {
		case "One":
			System.out.println("1");
			break;
		case "Two":
			System.out.println("2");
			break;
		case "Three":
			System.out.println("3");
			break;
		case "Four":
			System.out.println("4");
			break;
		case "Five":
			System.out.println("5");
			break;
		case "Six":
			System.out.println("6");
			break;
		case "Seven":
			System.out.println("7");
			break;
		case "Eight":
			System.out.println("8");
			break;
		case "Nine":
			System.out.println("9");
			break;
		case "Zero":
			System.out.println("0");
		default:
			break;
		}
		s.close();
	}

}
