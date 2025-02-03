class FriendlyPair
{
	public static int div(int num)
	{
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public static boolean isFriendly(int a,int b)
	{
		int sumA=div(a);
		int sumB=div(b);
		return (sumA==b && sumB==a);
	}
	
	public static void main(String[] args)
	{
		int a=220;
		int b=284;
		if(isFriendly(a,b))
		{
			System.out.println("friendly pair");
		}
		else
		{
			System.out.println("not friendly pair");
		}
	}
}
