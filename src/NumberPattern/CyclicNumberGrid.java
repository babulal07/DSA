package NumberPattern;

// Question: Print a cyclic 5 x 5 number pattern.
// Output:
// 1 2 3 4 5
// 2 3 4 5 1
// 3 4 5 1 2
// 4 5 1 2 3
// 5 1 2 3 4
public class CyclicNumberGrid {
	public static void main(String[] args) {
		int num = 3 ;
		
		//1st logic little complex f f
//		for(int i= 1; i< num*2;i++) {
//			for(int j= 1; j<num*2;j++) {
//				if(i+j<=num*2) {
//					System.out.print(i+j-1 + " ");
//				}
//				else {
//					System.out.print(i+j-num*2 +" ");
//				}
//			}
//		System.out.println();
//		}
		
		// Different login 
		for(int i= 1; i< num*2;i++) {
			int n = 1;
			for(int j= 1; j<num*2;j++) {
				if(i+j<=num*2) {
					System.out.print(i+j-1 + " ");
				}
				else {
					System.out.print(n++ +" ");
				}
			}
		System.out.println();
		}
	}
}
