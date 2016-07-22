import java.util.Scanner;

public class FindUniqueElementInArray {

	
	public static void main(String[] args) {
		System.out.println("Enter 5 values:");
		Scanner s=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(findUniqueElement(arr));
		s.close();
	}
		public static int findUniqueElement(int[] arr)
		{
		
		for(int i=0;i<5;i++)
		{int count=0;
			for(int j=0;j<5;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==2)
			{
				continue;
			}
			else {
				return arr[i];
			}
		}
		return 0;
		
	}

}
