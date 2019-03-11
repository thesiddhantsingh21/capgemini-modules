import java.util.*;
class Check
{
	boolean checkk(int n)
	{
		if(n==0)
		{
			return false;
		}
		else if(n==1)
		{
			return true;
		}
		else
		{
			while(n!=1)
			{
			     	if(n%2!=0)
				{
					return false;
				}
				n=n/2;
			}
			return true;
		}
	}	
}
class Main4
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Check cc=new Check();
		System.out.println(cc.checkk(n));
	}
}
