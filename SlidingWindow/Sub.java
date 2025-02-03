class Sub
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4};
		int n=arr.length;
		int sl=3;
		int ans=0;
		for(int i=0;i<n-sl+1;i++)
		{
			int temp=0;
			int j=i+sl-1;
			for(int k=i;k<=j;k++)
			{
				temp+=arr[k];
			}
			ans=Math.max(temp,ans);
		}
		System.out.println(ans);
	}
}
