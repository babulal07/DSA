package Array;

// Question: Remove duplicate values from the array by keeping the last occurrence of each value.
// Output: 6 5 3 4 2 1 0 0 0 0
// Note: Extra 0 values print because res has the same length as arr.
public class UniqueLastOccurrenceWithZeros {
	public static void main(String[] args) {
		int [] arr = {1,2,3,6,5,5,3,4,2,1};
		int [] res = new int[arr.length];
		
		int k = 0;
		for (int i = 0; i < res.length; i++) {
			int count =0;
			for (int j = i+1; j < res.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
			if(count==0) {
				res[k++]=arr[i];
			}
		}
		
		for (int ele : res) {
			System.out.print(ele+" ");
		}
	}
}
