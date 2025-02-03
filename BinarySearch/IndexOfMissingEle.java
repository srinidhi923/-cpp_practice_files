class IndexOfMissingEle
{
	public static void main(String[] args)
	{
		int arr[]={1,3,5,7,9};
		int n=arr.length;
		int r=n-1;
		int l=0;
		int target=10;
		int ans=-1;
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(arr[mid]==target) //code will not reach this condition, so its removal gives no change.
			{
				ans=mid;
				break;
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
		System.out.println(l);
	}
}
