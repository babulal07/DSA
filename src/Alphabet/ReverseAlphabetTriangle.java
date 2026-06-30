package Alphabet;
// Question: Print a reverse right triangle alphabet pattern.
// A B C D E 
// A B C D 
// A B C 
// A B 
// A 
public class ReverseAlphabetTriangle {
	public static void main(String[] args) {
		
	 int num = 3;
	 
     for(int i = 1 ;i<num*2 ;i++){
    	 char ch = 'A';
         for(int j = i ; j< num *2  ;j++){   	 
        		System.out.print(ch++ +" ");
         }
         System.out.println();
     }
 }
}
