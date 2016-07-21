import java.util.Scanner;

public class WorkingOrWeekdays {

	
	public static void main(String[] args) {
		System.out.println("Enter a day:");
		Scanner s=new Scanner(System.in);
		String day=s.next();
		switch (day) {
		case "Sunday":
			System.out.println("False");
			break;
		case "Monday":
			System.out.println("True");
			break;
		case "Tuesday":
			System.out.println("True");
			break;
		case "Wednesday":
			System.out.println("True");
			break;
		case "Thursday":
			System.out.println("True");
			break;
		case "Friday":
			System.out.println("True");
			break;
		case "Saturday":
			System.out.println("True");
			break;
		default:
			break;
		}
		s.close();
	}

}
