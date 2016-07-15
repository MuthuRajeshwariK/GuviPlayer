import java.util.Scanner;

public class Swaping {

	
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers:");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int temp=x;
		x=y;
		y=temp;
		System.out.println("x="+x+"\ny="+y);
		s.close();
	}

}
