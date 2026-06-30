package Alphabet;

// Question: Print a 5 x 5 alphabet pattern where each row has the same letter.
// A A A A A 
// B B B B B 
// C C C C C 
// D D D D D 
// E E E E E 

public class SameLetterRows {
	public static void main(String[] args) {
		 int num = 5;
		 char ch = 'A';
	     for(int i = 1 ;i<=num ;i++){
	    	
	         for(int j = 1 ; j<= num;j++){
	        	System.out.print(ch +" ");
	         }
	         ch++;
	         System.out.println();
	     }
	 }
	}
