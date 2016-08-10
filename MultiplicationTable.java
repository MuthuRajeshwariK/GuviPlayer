import java.util.Scanner;

public class MultiplicationTable {

	
	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=20;i++) {
			int mul=i*num;
			System.out.println(i+"*"+num+"="+mul);
		}
		s.close();
	}

}
