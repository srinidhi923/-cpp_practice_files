class Missingharacter
{
	public static Character bs(char arr[],char target)
	{
		int l=0;
		int r=arr.length-1;
		int ans=-1;
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(arr[mid]==target)
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
		if(r<0)
		{
			return 'a';
		}
		return arr[r];
	}
	
	public static void main(String[] args)
	{
		char arr[]={'c','e','g','k','y'};
		System.out.println(bs(arr,'d'));
		
		
	}
}
