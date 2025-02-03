import java.util.*;
class ArrayPartition
{
	public static void main(String[] args)
	{
		int arr[]={6,6,2,1,5,2};
		Arrays.sort(arr);
		int ans=0;
		for(int i=0;i<arr.length;i+=2)
		{
			ans+=arr[i];
		}
		System.out.println(ans);
	}
}
