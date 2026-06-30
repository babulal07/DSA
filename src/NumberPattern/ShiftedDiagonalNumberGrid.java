package NumberPattern;

// Question: Print a 5 x 5 number pattern with shifted values before the diagonal.
// Output:
// 1 2 3 4 5
// 5 2 3 4 5
// 4 5 3 4 5
// 3 4 5 4 5
// 2 3 4 5 5
public class ShiftedDiagonalNumberGrid {
	public static void main(String[] args) {
		int num = 3;
		for(int i= 1; i< num*2;i++) {
			int n= num*2-i;
			for(int j= 1; j<num*2;j++) {
				if(i<=j) {
					System.out.print(j + " ");
				}
				else {
					System.out.print(++n +" ");
				}
			}
		System.out.println();
		}
	}
}
