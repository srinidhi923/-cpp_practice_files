class Harshad
{
	public static boolean isHarshad(int num)
	{
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		return num%sum==0;
	}
	public static void main(String[] args)
	{
		int num=18;
		if(isHarshad(num))
		{
			System.out.println("harshad");
		}
		else
		{
			System.out.println("not harshad");
		}
	}
}
