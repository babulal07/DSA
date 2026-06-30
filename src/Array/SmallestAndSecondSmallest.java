package Array;

// Question: Find the smallest and second smallest distinct elements in the array.
// Output:
// 1
// 3
public class SmallestAndSecondSmallest {
	public static void main(String[] args) {
		int [] arr = {5,1,3,7,1};
		int first = arr[0];
        int second = arr[0];

        for (int i = 1; i < arr.length; i++) { 
           
        	if (arr[i] < first) {
               second = first;
                first = arr[i];
            } 
          
            else if (first == second && arr[i] > first) {
                second = arr[i];
            } 
            
            else if (arr[i] > first && arr[i] < second) {
              second = arr[i];
            }
            
        }
        System.out.println(first);
       System.out.println(second);
    }
}















/*
public class SecondSmallest 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,1,9,5,3,8,7,2,2,6};
		int smallest=arr[0];
		int secondSmall =arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
				secondSmall=smallest;
			}
			if((arr[i]<secondSmall || smallest==secondSmall) && arr[i] != smallest)  
			{
                
				secondSmall=arr[i];
			}
			
			
			
		}
		
//		System.out.println(smallest);
		System.out.println(secondSmall);
	}
}

//|| smallest==secondSmall
*/
