import java.util.Scanner;

public class DecimelToBinary {

	
	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String a=Integer.toBinaryString(num);
		System.out.println(a);
		s.close();
	}

}
