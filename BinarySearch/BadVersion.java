class BadVersion
{
	public static boolean IsOne(int arr[])
	{
		int arr[]={0,0,0,0,1,1,1,1};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				return true;
			}
		}
		return false;
	}

	public static int LeftMost(int arr[],int target)
	{
		int l=0;
		int r=arr.length-1;
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(arr[mid]>=target)
			{
				r=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		return l;
	}
	
	public static void main(String[] args)
	{
		int arr[]={0,0,0,0,1,1,1,1};
		int lm=LeftMost(arr,1);
		System.out.println(lm);
	}
}
