import java.util.Scanner;

public class RemoveString {

	
	public static void main(String[] args)
	{
		int k=0;
		int num=0;
		char[] ch=new char[10];
		System.out.println("Enter a String:");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		for(int i=0;i<str.length();i++) 
		{
			int flag=0;
			for(int j=0;j<i;j++)
			{
				if(ch[j]==str.charAt(i))
				{
				flag++;	
				}
			}
			if(flag==0)
			{
				ch[k]=str.charAt(i);
				k++;
				num++;
			}
		}
		for(int i=0;i<num;i++)
		{
			System.out.print(ch[i]);
		}
		s.close();
	}
	}

