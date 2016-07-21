import java.util.Scanner;

public class IntegerReverse {

	
	public static void main(String[] args) {
		System.out.println("Enter a value:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String str=Integer.toString(num);
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		str=sb.toString();
		int number=Integer.parseInt(str);
		System.out.println("Reversed value is "+number);
		s.close();
	}
}
