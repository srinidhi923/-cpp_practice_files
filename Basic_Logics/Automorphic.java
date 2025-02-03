class Automorphic
{
	public static boolean isAuto(int num)
	{
		int square=num*num;
		if(num<0)
		{
			return false;
		}
		while(num>0)
		{
			if(num%10!=square%10)
			{
				return false;
			}
			num/=10;
			square/=10;
		}
		return true;
	}
	public static void main(String[] args)
	{
		int num=76;
		if(isAuto(num))
		{
			System.out.println("automorphic");
		}
		else
		{
			System.out.println("not automorphic");
		}
	}
}
