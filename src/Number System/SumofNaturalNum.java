import java.util.Scanner;

public class SumofNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start point");
        int start = sc.nextInt();
        System.out.println("Enter the end point");
        int end = sc.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("The sum of natural numbers from " + start + " to " + end + " is: " + sum);
        sc.close();
    }
}