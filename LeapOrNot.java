import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		int number=s.nextInt();
		if(number%4==0)
		{
			System.out.println("Leap year");
		}
		else{
			System.out.println("Not a leap year");
		}
		s.close();
	}

}
