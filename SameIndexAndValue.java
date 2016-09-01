public class SameIndexAndValue {
	public static void main(String[] args) {
		int[] arr={-3,-1,3,7};
		for(int i=0;i<arr.length;i++) {
			if(i==arr[i]) {
				System.out.println(arr[i]);
			}
			else {
				System.out.println("No matching element");
			}
		}
	}
}
