import java.util.Scanner;

public class LeastNumberAfterDeleting {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		System.out.println("Enter the key");
		int key=s.nextInt();
		int length=String.valueOf(num).length();
		int[] arr=new int[length];
		for(int i=length-1;i>=0;i--) {
			int a=num%10;
			arr[i]=a;
			num/=10;
		}
		for(int i=0;i<length-1;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		String str="";
		for(int i=0;i<length-key;i++) {
			str+=arr[i];
		}
		System.out.println(str);
	}

}
