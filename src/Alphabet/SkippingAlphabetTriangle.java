package Alphabet;
// Question: Print a decreasing alphabet pattern by skipping one letter each time.
// A C E G I 
// B D F H 
// C E G 
// D F 
// E 
public class SkippingAlphabetTriangle {
	public static void main(String[] args) {
		
		 int num = 3;
		 
		 //1st logic
	     for(int i = 1 ;i<num*2 ;i++){
	    	 char ch = 'A';
	         for(int j = 1 ; j< num *2  ;j++){ 
	        	 if(i<=j) System.out.print(ch++ +" ");
	      ch++;
	         }
	         System.out.println();
	     }
	     
//	     2nd logic
//		 char ch = 'A';
//		 for(int i = 1 ;i<num*2 ;i++){
//	    	 char ch1 = ch++;
//	        for(int j = 1 ; j<=num*2-i  ;j++){ 
//	        System.out.print(ch1++ +" ");
//	        }
//	         System.out.println();
//	    }
	     
	     
	     
	     
	}
}
