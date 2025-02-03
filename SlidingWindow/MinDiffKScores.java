
/*
//slinding window approach 1

import java.util.*;
class MinDiffKScores
{
	public static void main(String[] args)
	{
		int arr[]={9,1,4,7};
		Arrays.sort(arr);
		int k=2;
		int n=arr.length;
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<n-k+1;i++)
		{
			int j=i+k-1;
			int temp=arr[j]-arr[i];
			ans=Math.min(ans,temp);
		}
		System.out.println(ans);
	}
}
*/

// approach2

import java.util.*;
class MinDiffKScores
{
	public static void main(String[] args)
	{
    		int nums[]={9,4,1,7};
		Arrays.sort(nums);
		int n=nums.length;
		int k=2;
		int ans=Integer.MAX_VALUE;
		int l=0;
		for(int r=0;r<n;r++)
		{
		    if(r-l==k)
		    {
		        l++;
		    }
		    if(r-l+1==k)
		    {
		        int temp=nums[r]-nums[l];
		        ans=Math.min(temp,ans);
		    }
		}
		System.out.println(ans);
    }
}
