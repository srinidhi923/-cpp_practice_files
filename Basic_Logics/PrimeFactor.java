class PrimeFactor
{
	public static void fun(int num)
	{
		while(num%2==0)
		{
			System.out.println(2);
			num/=2;
		}
		for(int i=3;i<=Math.sqrt(num);i+=2)
		{
			while(num%i==0)
			{
				System.out.println(i);
				num/=i;
			}
		}
		if(num>2)
		{
			System.out.println(num);
		}
	}
	public static void main(String[] args)
	{
		int num=56;
		fun(num);
	}
}
