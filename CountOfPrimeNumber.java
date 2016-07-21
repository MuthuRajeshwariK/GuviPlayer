import java.util.Scanner;



public class CountOfPrimeNumber {

		
	public static void main(String[] args) {
			System.out.println("Enter a range:");
			Scanner s=new Scanner(System.in);
			int number=s.nextInt();
			int sum=0;
			for(int i=number;i>0;i--)
			{
				int count=0;
				for(int j=i;j>0;j--)
				{	
				if(i%j==0)
				{
					count++;
				}
				}
			if(count==2)
			{
				sum++;
			}
			
			}
			System.out.println(sum);
			s.close();
		}

	}
