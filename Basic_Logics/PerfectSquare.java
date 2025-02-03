class PerfectSquare
{
	public static boolean perSqrt(int num)
	{
		int l=1;
		int r=num;
		if(num<0)
		{
			return false;
		}
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			long sqrt=(long)mid*mid;
			if(sqrt==num)
			{
				return true;
			}
			else if(sqrt<num)
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		int num=5;
		if(perSqrt(num))
		{
			System.out.println("perfect square");
		}
		else
		{
			System.out.println("not perfect square");
		}
	}
}
