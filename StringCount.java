import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] ch=str.split(" ");
		int length=ch.length;
		System.out.println("No of words in given input is "+length);
	}
}
