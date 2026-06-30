package NumberSystem;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int bin = 0;
        int pos = 1;
        while(num!=0){
            bin = bin + (num%2)*pos;
            pos*=10;
            num/=2;
        }
        System.out.println(bin);
    }
}