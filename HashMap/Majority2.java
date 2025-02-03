import java.util.*;
class Majority2
{
	public static void main(String[] args)
	{
		int arr[]={3,6,3,1,3,3,3};
		int n=arr.length/2;
		Arrays.sort(arr);
		int ans=arr[n];
		System.out.println("Majority ele is:" + " "+ ans);
	}
}
