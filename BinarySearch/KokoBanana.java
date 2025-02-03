class KokoBanana
{
	public static boolean isPossible(int arr[],int h,int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			int upper=arr[i]/k;
			if(arr[i]%k!=0)
			{
				upper++;
			}
			h-=upper;
		}
			if(h<0)
			{
				return false;
			}
			return true;
	}	
	public static void main(String[] args)
	{
		int h=8;
		int arr[]={3,6,7,11};
		int l=0;
		int r=(int)Math.pow(10,9);
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(isPossible(arr,h,mid))
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
