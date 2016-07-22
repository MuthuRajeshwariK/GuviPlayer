import java.util.Scanner;

public class NoOfWordsInLine {

	
	public static void main(String[] args) {
		System.out.println("Enter a sentence:");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] str1=str.split(" ");
		int length=str1.length;
		System.out.println("Number of words in a line:"+length);

	}

}
