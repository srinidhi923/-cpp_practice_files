class SubAvgGreaterThanThresold
{
	public static void main(String[] args)
	{
		int arr[]={2,2,3,2,4,5,6,3,4};
		int sl=3;
		int thresold=4;
		int ans=0;
		int l=0;
		int avg=0;
		int temp=0;
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
				avg=temp/sl;
				if(avg>=thresold)
				{
					ans+=1;
				}
			}
		}
		System.out.println(ans);
	}
}
