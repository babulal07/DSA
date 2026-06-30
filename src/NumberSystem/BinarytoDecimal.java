package NumberSystem;

import java.util.Scanner;

public class BinarytoDecimal {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int dec = 0;
        int pos = 1;
        while(num!=0){
            dec = dec + (num%10)*pos;
            pos*=2;
            num/=10;
        }
        System.out.println(dec);
    }
}
