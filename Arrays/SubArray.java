class SubArray
{
	public static void main(String[] args)
	{
		int arr[]={-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		int ans=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp=0;
				for(int k=i;k<=j;k++)
				{
					temp+=arr[k];
				}
				ans=Math.max(ans,temp);
			}
		}
		System.out.println(ans);
	}
}
