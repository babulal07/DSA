package Patterns;

public class CenterStar {
    public static void main(String[] args) {
        int n = 3; // Size of the center star pattern
        for (int i = 1; i < n*2; i++) {
            for (int j = 1; j < n*2; j++) {
                if (i==n&&j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
