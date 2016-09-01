import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class SumOfDigitsOfPrimeNumber {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		int num=100;
		int t=0;
		for(int j=100;j>0;j--) {
			int count=0;
			for(int i=j;i>0;i--) {
				if(j%i==0) {
					count++;
				}
			}
			if(count==2) {
				al.add(j);
			}
		}
		Set<Integer> al1=new LinkedHashSet<>();
		for(int i=0;i<al.size();i++) {
			int temp=al.get(i);
			while(temp!=0) {
				int a=temp%10;
				int b=temp/10;
				for(int j=0;j<al.size();j++) {
					if(al.get(j)==a+b) {
						al1.add(al.get(j));
					}
				}
				temp/=10;
			}
		}
		System.out.println(al1);
	}
}
