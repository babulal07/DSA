package NumberSystem;

public class Automorphic {
    public static void main(String[] args) {
        int num = 25; 
        int sqr = num*num;
        int div = 10;
        while(num%div!=0){
            div*=10;
        }

        if(num==(sqr%div)) System.out.println("Automorphic Num");
        else System.out.println("Not an Automorphic Num");
    }
}
