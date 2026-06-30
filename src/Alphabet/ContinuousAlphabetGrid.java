package Alphabet;
// Question: Print a 5 x 5 alphabet pattern with continuous letters.
// A B C D E 
// F G H I J 
// K L M N O 
// P Q R S T 
// U V W X Y 
public class ContinuousAlphabetGrid {
	public static void main(String[] args) {
		 int num = 5;
		 char ch = 'A';
	     for(int i = 1 ;i<=num ;i++){
	         for(int j = 1 ; j<= num;j++){
	        	System.out.print(ch++ +" ");
	         }
	         System.out.println();
	     }
	 }
	}
