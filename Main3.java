import java.util.*;
class Check
{
	boolean checknumber(int n)
	{
		String s=Integer.toString(n);
		int i;
		int len=s.length();
		for(i=0;i<len-2;i++)
		{
			if((int)s.charAt(i)<=(int)s.charAt(i+1))
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}
class Main3
{
	public static void main(String ar[])
	{
		int nn;
		Scanner sc=new Scanner(System.in);
		nn=sc.nextInt();
		Check c=new Check();
		System.out.println(c.checknumber(nn));
	}
}		