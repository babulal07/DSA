package NumberPattern;

// Question: Print a decreasing row number pattern where each row starts from the row number.
// Output:
// 1 2 3 4 5
// 2 3 4 5
// 3 4 5
// 4 5
// 5
public class RowStartingNumberTriangle {
		public static void main(String[] args) {
			int num= 3 ;
			for(int i= 1; i< num*2;i++) {
				for(int j= i; j<num*2;j++) {
					System.out.print(j+ " ");
				}
			System.out.println();
			}
		}
	}
