import java.util.Scanner;

public class RotateAnArray {

	public static void main(String[] args) {
		System.out.println("Enter array size");
		Scanner s=new Scanner(System.in);
		int index=s.nextInt();
		System.out.println("Enter array values");
		int[] arr=new int[index];
		for(int i=0;i<index;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter a position");
		int position=s.nextInt();
		for(int i=position-1;i<index;i++)
		{
			System.out.println(" "+arr[i]);
			if(i==index-1)
			{
				i=-1;
			}
			if(i==position-2)
			{
				break;
			}
		}s.close();
		}
	}
