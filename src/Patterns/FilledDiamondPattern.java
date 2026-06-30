package Patterns;

// Question: Print a filled diamond star pattern with blank first and last rows.
// Output:
//
//           *
//         * * *
//       * * * * *
//     * * * * * * *
//   * * * * * * * * *
//     * * * * * * *
//       * * * * *
//         * * *
//           *
//
public class FilledDiamondPattern {

	public static void main(String[] args) {
		 int num = 6;
	     for(int i = 1 ;i< num*2 ;i++){
	         for(int j = 1 ; j< num*2;j++){
	        	 if( i+j <= num+1 || i-j>=num-1 || j-i >= num-1 ||i+j >= num*3-1) //My logic
//	        	 if(i+j>num+1 && j-i<num-1 && i-j<num-1&&i+j<3*num-1) //Sir Logic
	        	 {
	                 System.out.print("  ");
	             }
	             else{
	                 System.out.print("* ");
	             }
	         }
	         System.out.println();
	     }
	 }
	}
