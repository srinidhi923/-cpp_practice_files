//prime or not
class Prime
{
	public static void main(String[] args)
	{
		int num=10;
		int count=0;
		if(num<2)
		{
			System.out.println("not prime");
		}
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
	}
}
