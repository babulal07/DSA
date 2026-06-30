package NumberPattern;

// Question: Print numbers from 25 to 1 in a spiral-style 5 x 5 matrix.
// Output:
// 21 22 23 24 25
// 20 7 8 9 10
// 19 6 1 2 11
// 18 5 4 3 12
// 17 16 15 14 13
public class SpiralNumberMatrix {
	public static void main(String[] args) {
		int num = 5;
		int arr [][] = new int [5][5];
		for(int i= 1;i<=arr.length;i++) {
			arr[0][i-1]=num*(num-1)+i;
		}
		
		int top = 1 , left=0;
		int bottom = num-1,right=num-1;
		int n = num * (num-1);
		while(top<bottom && left<right) {
	
			for(int i = top;i<=bottom;i++) {
				arr[i][left]=n--;
			}
			left++;
			for(int i = left ;i<=right;i++) {
				arr[bottom][i]=n--;
			}
			bottom--;
			for(int i = bottom;i>=top;i--) {
				arr[i][right]=n--;
			}
			right--;
			for(int i = right;i>=left;i--) {
				arr[top][i]=n--;
			}
			top++;
		}
		System.out.println();
		
		for(int i =0;i<num;i++) {
			for(int j =0;j<num;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	
	}
}
