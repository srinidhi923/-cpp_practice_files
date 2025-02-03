class Strong
{
	public static int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static boolean isStrong(int num)
	{
		int rem=0;
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			rem=temp%10;
			sum+=fact(rem);
			temp/=10;
		}
		return sum==num;
	}
	public static void main(String[] args)
	{
		int num=155;
		if(isStrong(num))
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not strong number");
		}
	}
}
