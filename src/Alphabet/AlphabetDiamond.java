package Alphabet;
// Question: Print a diamond alphabet pattern with continuous letters.
//     A     
//   B C D   
// E F G H I 
//   J K L   
//     M 
public class AlphabetDiamond {

	public static void main(String[] args) {
		  int num= 3;
	        char ch = 'A';

	        for(int i=1;i<num*2;i++){
	            for(int j= 1; j<num*2;j++){
	                if(i+j>num&&i-j<num&&j-i<num&&i+j<num*3){
	                    System.out.print(ch++ +" ");
	                }
	                else{
	                    System.out.print("  ");
	                }
	            }

	            System.out.println();
	        }
	    }
	}
