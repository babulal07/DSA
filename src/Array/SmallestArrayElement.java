package Array;

// Question: Find the smallest element in the array.
// Output: 1
public class SmallestArrayElement {
	public static void main(String[] args) {
		int [] arr = {3,2,5,1,7};
		int small = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(small>arr[i]) {
				small=arr[i];
			}
		}
		System.out.println(small);	
	}
}
