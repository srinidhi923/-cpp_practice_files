class RightMostBS
{
	public static int Rightmost(int arr[],int target)
	{
		int l=0;
		int r=arr.length-1;
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(arr[mid]==target) //no need of this 
			{
				l=mid+1;
			}
			else if(arr[mid]>target)
			{
				r=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		if(r<0)
		{
			return -1;
		}
		if(arr[r]!=target)
		{
			return -1;
		}
		return r;
	}
	public static void main(String[] args)
	{
		int arr[]={1,2,3,3,3,3,3,5};
		System.out.println(Rightmost(arr,3));
	}
}
