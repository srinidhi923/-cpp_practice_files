class Abundant
{
	public static boolean isAbu(int num)
	{
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum>num;
	}
	public static void main(String[] args)
	{
		int num=12;
		if(isAbu(num))
		{
			System.out.println("abundant");
		}
		else
		{
			System.out.println("not abundant");
		}
	}
}
