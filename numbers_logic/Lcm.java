class Lcm
{
	public static int calcHcf(int a,int b)
	{
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static int calcLcm(int a,int b)
	{
		return Math.abs(a*b)/calcHcf(a,b);
	}
	public static void main(String[] args)
	{
		int num1=4;
		int  num2=6;
		int lcm=calcLcm(num1,num2);
		System.out.println(lcm);
	}
}
