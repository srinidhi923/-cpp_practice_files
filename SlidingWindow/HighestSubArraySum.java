class HighestSubArraySum
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5};
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
					ans=Math.max(ans,temp);	
				}
			}
		}
		System.out.println(ans);
	}
}
