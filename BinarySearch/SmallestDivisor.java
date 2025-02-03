class SmallestDivisor
{
	public static boolean isPossible(int arr[],int thresold,int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			int upper=arr[i]/k;
			if(arr[i]%k!=0)
			{
				upper++;
			}
			thresold-=upper;
		}
			if(thresold<0)
			{
				return false;
			}
			return true;
	}
	public static void main(String[] args)
	{
		int thresold=6;
		int arr[]={1,2,5,9};
		int k=2;
		int l=0;
		int r=100000;
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(isPossible(arr,thresold,mid))
			{
				r=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		System.out.println(l);
	}
}
