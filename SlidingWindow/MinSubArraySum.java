//minimun size subarray sum

class MinSubArraySum
{
	public static void main(String[] args)
	{
		int arr[]={2,3,1,2,4,3};
		int l=0;
		int temp=0;
		int target=7;
		int ans=Integer.MAX_VALUE;
		for(int r=0;r<arr.length;r++)
		{
			temp+=arr[r];
			while(temp>=target)
			{
				temp-=arr[l];
				ans=Math.min(ans,r-l+1);
				l++;
			}
		}
		if(ans==Integer.MAX_VALUE)
		{
			System.out.println(0);
		}
		System.out.println(ans);
	}
}


