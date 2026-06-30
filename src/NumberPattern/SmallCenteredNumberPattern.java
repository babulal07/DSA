package NumberPattern;


// Question: Print a small centered number pattern that starts each row from num and expands.
// Output:
//     3
//   3 2 3
// 3 2 1 4 5
public class SmallCenteredNumberPattern {
	public static void main(String[] args) {
	int num = 3;
	for(int i= 1 ; i<= num ; i++) 
	{
		int m= num ;
		int n=i; 
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
