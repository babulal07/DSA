package NumberPattern;


// Question: Print a centered pyramid that decreases to 1 and then increases again.
// Output starts:
//                 1
//               2 1 2
//             3 2 1 2 3
// Continues up to:
// 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9
public class ReverseToOneNumberPyramid {
	public static void main(String[] args) {
		int num = 9;
		for(int i= 1 ; i<= num ; i++) 
		{
			int m= i ;
			int n=1; 
			for(int j= 1 ; j<num+i ; j++) 
			{
				if(i+j>num) 
				{
					if(j<=num) 
					{
						System.out.print(m-- + " ");
					}
					else 
					{
						System.out.print(++n +" ");
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

