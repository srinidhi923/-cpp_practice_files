import java.util.*;
class MinCandy
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3};
		Arrays.sort(arr);
		int ans=0;
		int took=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(took==2)
			{
				took=0;
			}
			else
			{
				ans+=arr[i];
				took++; 
			}
		}
		System.out.println(ans);
	}
}
