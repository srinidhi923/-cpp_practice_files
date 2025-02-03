//fibinocci series
class Fibinocci
{
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int n=20;
		int next;
		System.out.println(a+","+b);
		for(int i=2;i<=n;i++)
		{
			next=a+b;
			a=b;
			b=next;
			System.out.println(next);
		}
	}
}
