import java.util.Scanner;

public class ArmStrongNumber {

	
	public static void main(String[] args) {
		System.out.println("Enter a value:");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int sum=0;
		int num=number;
		while(num!=0)
		{
			int a=num%10;
			num=num/10;
			sum=sum+a*a*a;
		}
		if(sum==number)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
	}

}
