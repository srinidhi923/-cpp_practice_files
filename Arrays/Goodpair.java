class GoodPair
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,1,2,3,4};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(i+","+j);
				}
			}
		}
	
	}
}
