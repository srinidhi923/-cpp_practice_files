//check armstrong
class Armstrong
{
	public static boolean isArmstrong(int num)
	{
		int rem=0;
		int temp;
		int result=0;
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
		int num=143;
		if(isArmstrong(num))
		{
			System.out.println("given is Armstrong");
		}
		else
		{
			System.out.println("not Armstrong");
		}
		
	}
}
