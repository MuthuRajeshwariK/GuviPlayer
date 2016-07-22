import java.util.Scanner;

public class SumIsPalindromeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int length=String.valueOf(num).length();
		int k=0;
		int[] arr=new int[length];
		while(num!=0)
		{
			int a=num%10;
			arr[k]=a;
			k++;
			num/=10;
		}
		int number=0;
		for(int i=0;i<length;i++)
		{
			number+=arr[i];
		}
		String str=Integer.toString(number);
		StringBuffer sb=new StringBuffer(str);
		sb=sb.reverse();
		String str1=sb.toString();
		if(str1.equals(str))
		{
			System.out.println(str+" is a palindrome");
		}
		else
		{
			System.out.println(str+" is not a palindrome");
		}
		s.close();
	}

}
