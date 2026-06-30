package NumberPattern;

// Question: Print numbers from 25 to 1 in a vertical snake pattern.
// Output:
// 25 16 15 6 5
// 24 17 14 7 4
// 23 18 13 8 3
// 22 19 12 9 2
// 21 20 11 10 1
public class ReverseVerticalSnakeNumberPattern {
	public static void main(String[] args) {
		int num = 5;
		for(int i=1;i<=num;i++) {
			for(int j = 1; j<=num;j++) {
				if (j%2==0) {
					System.out.print(i+num*(num-j)+" ");
				}
				else {
					System.out.print(num*(num-j+1) - (i-1)+" ");
				}
			}
			System.out.println();
		}
	}
}
