class Len3SubArrGreaterThanThresold
{
	public static void main(String[] args)
	{
		int arr[]={1,3,5,6,2};
		int l=0;
		int sl=3;
		int ans=0;
		int temp=0;
		int thresold=6;
		for(int r=0;r<arr.length;r++)
		{
			temp+=arr[r];
			if(r-l==sl)
			{
				temp-=arr[l];
				l++;
			}
			if(r-l+1==sl)
			{
				if(temp>=thresold)
				{
					ans+=1;
				}
			}
		}
		System.out.println(ans);
	}
}
