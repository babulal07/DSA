package NumberSystem;

import java.util.Scanner;

public class ProductofNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start point");
        int start = sc.nextInt();
        System.out.println("Enter the end point");
        int end = sc.nextInt();

        int product = 1;
        for (int i = start; i <= end; i++) {
            product *= i;
        }
        System.out.println("The product of natural numbers from " + start + " to " + end + " is: " + product);
        sc.close();
    }
}
