package Patterns;

// Question: Print a heart shape using stars.
// Output:
//   * *   * *
// *     *     *
// *           *
//   *       *
//     *   *
//       *
public class HeartPattern {
	public static void main(String[] args) {
		 int num = 7;
	     for(int i = 1 ;i<num ;i++){
	         for(int j = 1 ; j<= num;j++){
	        	if((i==2&&j==4)||i+j==10||i-j==2||i+j==3||j-i==5||(i==1&&(j==3||j==5)))
	        	 {
	                 System.out.print("* ");
	             }
	             else{
	                 System.out.print("  ");
	             }
	         }
	         System.out.println();
	     }
	 }
	}
