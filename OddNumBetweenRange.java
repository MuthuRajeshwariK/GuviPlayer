import java.util.Scanner;

	public class OddNumBetweenRange {

		
		public static void main(String[] args) {
			System.out.println("Enter the start value:");
			Scanner s=new Scanner(System.in);
			int first=s.nextInt();
			System.out.println("Enter the last value:");
			int last=s.nextInt();
			System.out.println("Odd numbers between "+first+" and "+last+" is ");
			for(int i=first;i<=last;i++)
			{
				if(i%2==1)
				{
					System.out.print(i+" ");
				}
			}
			s.close();
		}

	}

