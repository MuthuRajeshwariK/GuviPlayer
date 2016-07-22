import java.util.Scanner;

public class Target {

	
	public static void main(String[] args) {
		System.out.println("Enter 5 element:");
		Scanner s=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the target value:");
		int target=s.nextInt();
		for(int i=0;i<4;i++)
		{
			if(arr[i]+arr[i+1]==target)
			{
				System.out.print(arr[i]+" "+arr[i+1]);	
			}
		}
		s.close();
	}

}
