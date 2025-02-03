import java.util.*;
class BinarySearch
{
	public static void main(String[] args)
	{
		int arr[]={2,4,7,9,1,10};
		Arrays.sort(arr);
		int n=arr.length;
		int l=0;
		int h=n-1;
		int target=13;
		int ans=-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			//mid=l+(h-l)/2;		
			if(arr[mid]==target)
			{
				ans=mid;
				break;
			}
			else if(arr[mid]>target)
			{
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		System.out.println(ans);
	}
}
