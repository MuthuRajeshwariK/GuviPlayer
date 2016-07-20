import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		int number=s.nextInt();
		int fact=0;
		if(number==0 && number==1)
		{	System.out.println("hi");
			fact++;
			System.out.println("Factorial of "+number+" is "+fact);
		}
		else
		{	fact++;
			for(int i=number;i>0;i--)
			{
				fact=fact*i;
				
			}
			System.out.println("Factorial of "+number+" is "+fact);
		}
			s.close();
	}

}
