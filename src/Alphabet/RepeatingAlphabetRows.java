package Alphabet;
// Question: Print a 5 x 5 alphabet pattern where each row starts from A.
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 
public class RepeatingAlphabetRows {
	public static void main(String[] args) {
		 int num = 5;
		 
	     for(int i = 1 ;i<=num ;i++){
	    	 char ch = 'A';
	         for(int j = 1 ; j<= num;j++){
	        	System.out.print(ch++ +" ");
	         }
	         System.out.println();
	     }
	 }
	}
