//nth term of fibnocci
class FibTerm
{
	public static int fun(int n)
	{
		int a=0;
		int b=1;
		int next=0;
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		for(int i=2;i<=n;i++)
		{
			next=a+b;
			a=b;
			b=next;
		}
		return next;
	}
	public static void main(String[] args)
	{
		int n=10;
		System.out.println(fun(10));
	}
}
