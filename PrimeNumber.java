import java.util.Scanner;


public class PrimeNumber {

	
	public static void main(String[] args) {
		int count=0;
		System.out.println("enter a value:");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		for(int i=number;i>0;i--)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(number+" is prime");
		}
		else
		{
			System.out.println(number+" is not prime");
		}
		s.close();
	}

}
