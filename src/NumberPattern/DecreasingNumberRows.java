package NumberPattern;

// Question: Print a decreasing row number pattern starting from 1 in every row.
// Output:
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class DecreasingNumberRows {
	
	public static void main(String[] args) {
		int num= 3 ;
		for(int i= 1; i< num*2;i++) {
			for(int j= 1; i+j<=num*2;j++) {
				System.out.print(j+ " ");
			}
		System.out.println();
		}
	}
}
