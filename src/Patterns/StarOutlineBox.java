package Patterns;

// Question: Print a 5 x 5 star outline pattern using borders and diagonals.
// Output:
// * * * * *
//   *   *
//     *
//   *   *
// * * * * *
public class StarOutlineBox {
	  public static void main(String[] args) {
	        int num = 3;
	        for(int i = 1 ;i< num*2 ;i++){
	            for(int j = 1 ; j< num*2;j++){
//	            	if(((j<=i&&i+j<=num*2)||(j>=i&&i+j>=num*2))) 
//	            	if(((j<=i&&i+j<=num*2)||(j>=i&&i+j>=num*2)) && (i!=num || (j!=(num+1)/2 && j!=num+((num+1)/2)-1)))
	            	if((i==1||i==num*2-1||i==j||i+j==num*2))
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
