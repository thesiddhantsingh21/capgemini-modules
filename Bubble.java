import java.util.*;
class Bubble
{
  	public static void main(String []args)
	{
    	int n, c, d, swap;
   	Scanner in = new Scanner(System.in);
    	System.out.println("Input number of integers to sort");
    	n = in.nextInt();
 
    	int ar[] = new int[n];
 
    	System.out.println("Enter"+n+"integers");
 
    	for(c=0;c<n;c++)
	
      	ar[c]=in.nextInt();

    	for (c=0;c<(n-1);c++) 
	{
      		for (d=0;d<n-c-1;d++) 
		{
        		if (ar[d] > ar[d+1]) 
        		{
          			swap = ar[d];
          			ar[d] = ar[d+1];
          			ar[d+1] = swap;
        		}
      		}
    	}
 	System.out.println("Sorted list of numbers:");
 
 	for (c=0;c<n;c++)
	{
      	System.out.println(ar[c]);
  	}
}
}