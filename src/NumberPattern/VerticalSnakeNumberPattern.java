package NumberPattern;

// Question: Print numbers from 1 to 25 in a vertical snake pattern from left to right.
// Output:
// 1 10 11 20 21
// 2 9 12 19 22
// 3 8 13 18 23
// 4 7 14 17 24
// 5 6 15 16 25
public class VerticalSnakeNumberPattern {
	public static void main(String[] args) {
		int num = 5;
		for(int i=1;i<=num;i++) {
			for(int j = 1; j<=num;j++) {
				if (j%2!=0) {
					System.out.print(i+num*(j-1)+" ");
				}
				else {
					System.out.print(num*j - (i-1)+" ");
				}
			}
			System.out.println();
		}
	}
}
