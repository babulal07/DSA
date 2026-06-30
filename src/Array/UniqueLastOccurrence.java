package Array;

// Question: Remove duplicate values from the array by keeping the last occurrence of each value.
// Output: 6 5 3 4 2 1
public class UniqueLastOccurrence {
	public static void main(String[] args) {
		int [] arr = {1,2,3,6,5,5,3,4,2,1};
		
		int size = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			if(isDuplicate(arr, i)) {
				size--;
			}
		}
		
		int [] res = new int[size];
		int k =0;
		
		for (int i = 0; i < arr.length; i++) {
			if(!isDuplicate(arr, i)) {
				res[k++]=arr[i];
			}
		}
		
		for (int ele : res) {
			System.out.print(ele+" ");
		}
	}
	
	public static boolean isDuplicate(int []arr,int i) {
		
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]) {
				return true;
			}
		}
		
		return false;
	}
}
