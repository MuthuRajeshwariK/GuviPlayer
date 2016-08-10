import java.util.Scanner;

public class PrintNumbersOnly {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String output="";
		char[] ch={'0','1','2','3','4','5','6','7','8','9'};
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<10;j++) {
				
				if(str.charAt(i)==ch[j]) {
					output+=str.charAt(i);
				}
			}
		}
		System.out.println(output);
		s.close();	
		

	}

}
