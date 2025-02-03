//prime with in range

class PrimeRange
{
	public static boolean Prime(int n)
	{
		if(n<2)
		{
			return false;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		int l=1;
		int u=20;
		for(int i=l;i<=u;i++)
		{
			if(Prime(i))
			{
				System.out.println(i);
			}
		}
	}
}
