package Patterns;

public class SolidTriangle180 {
    public static void main(String[] args) {
        int n = 5; // Size of the solid triangle pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i+j>n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
