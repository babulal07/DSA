import java.util.Scanner;

public class FactorCountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
            }
        System.out.println("The number of factors of " + num + " is: " + count);
        sc.close();
    }
}
