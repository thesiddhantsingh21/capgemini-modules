import java.util.*;
class Average
{
	double avg(int n,int ar[])
	{
		int sum=0;
		double avg=0.0;
		for(int i=0;i<n;i++)
		{
			sum=sum+ar[i];
		}
		avg=sum/n;
		return avg;
	}
}
class Main6
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();	
		}
		Average av=new Average();
		System.out.println(av.avg(n,ar));
	}
}	
		