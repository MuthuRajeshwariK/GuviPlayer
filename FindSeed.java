import java.util.Scanner;

public class FindSeed {

	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int length=String.valueOf(num).length();
		int seed=num;
		for(int i=0;i<length;i++) {
			int temp=num%10;
			seed*=temp;
			num/=10;
		}
		System.out.println("seed:"+seed);
		s.close();

	}

}
