import java.util.*;
class Prime
{
	int flag=0;
	boolean p(int n)
	{
		int i;
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Main5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int nn=sc.nextInt();
		Prime p=new Prime();
		System.out.println(p.p(nn));
	}
}
			