//armstrong given in range
class ArmstrongRange
{
	public static boolean isArmstrong(int num)
	{
		int temp;
		int result=0;
		int rem=0;
		temp=num;
		int digits=String.valueOf(num).length();
		while(temp!=0)
		{
			rem=temp%10;
			result+=Math.pow(rem,digits);
			temp/=10;
		}
		return result==num;
	}
	public static void main(String[] args)
	{
		int a=1;
		int b=200;
		for(int i=a;i<=b;i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
		}
	}
}
