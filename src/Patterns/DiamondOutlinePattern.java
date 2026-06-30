package Patterns;

// Question: Print a large star diamond outline with a center star.
// Output:
//         *
//       *   *
//     *       *
//   *           *
// *       *       *
//   *           *
//     *       *
//       *   *
//         *
public class DiamondOutlinePattern {
	public static void main(String[] args) {
	 int num = 5;
     for(int i = 1 ;i< num*2 ;i++){
         for(int j = 1 ; j< num*2;j++){
//         if((i+j>num&& j-i<num &&i-j<num&&i+j<num*3 && (i+j)%2==0))
        	 if((i==num && j==num )|| i+j == num+1 || i-j==num-1 || j-i == num-1 ||i+j == num*3-1)
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
