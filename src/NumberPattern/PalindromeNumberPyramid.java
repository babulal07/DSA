package NumberPattern;

// Question: Print a centered increasing and decreasing number pyramid.
// Output:
//           1
//         1 2 1
//       1 2 3 2 1
//     1 2 3 4 3 2 1
//   1 2 3 4 5 4 3 2 1
// 1 2 3 4 5 6 5 4 3 2 1
public class PalindromeNumberPyramid {
	public static void main(String[] args) {
		int num = 6;
		for(int i= 1 ; i<= num ; i++) 
		{
			int n= 1 ;
			int m= i ;
			for(int j= 1 ; j<num+i ; j++) 
			{
				if(i+j>num) 
				{
					if(j<=num) 
					{
						System.out.print(n++ + " ");
					}
					else 
					{
						System.out.print(--m +" ");
					}
				}
				else 
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}
