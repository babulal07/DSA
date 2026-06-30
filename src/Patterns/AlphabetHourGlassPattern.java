package Patterns;

// Question: Print an hourglass alphabet pattern with continuous letters.
// Output:
// A B C D E
//   F G H
//     I
//   J K L
// M N O P Q
public class AlphabetHourGlassPattern {
    public static void main(String[] args) {
        int num = 3;
       char ch = 'A';
        for(int i = 1 ;i< num*2 ;i++){
            for(int j = 1 ; j< num*2;j++){
                 if(((i<=j&&i+j<=num*2)||(i>=j&&i+j>=num*2)))
                    {
                    System.out.print(ch++ + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();   
        }
    }
}

