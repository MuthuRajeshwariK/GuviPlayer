import java.util.Scanner;

public class ArrayReverse {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 10 values:");
		int[] a=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The reverse elements are:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+"\t");
		}
		s.close();
	}

}
