class SecondLargest
{
	public static void main(String[] args)
	{
		int arr[]={1,5,4,3,8,2};
		int n=arr.length;
		int largest=arr[0];
		int slargest=Integer.MIN_VALUE;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>largest)
			{
				slargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>slargest && arr[i]!=largest)
			{
				slargest=arr[i];
			}
		}
		System.out.println(slargest);
	}
}
