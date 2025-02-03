import java.util.*;
class TwoSum2
{
	public static void main(String[] args)
	{
		int arr[]={2,7,11,15};
		int n=arr.length;
		int target=9;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int complement=target-arr[i];
			if(hm.containsKey(complement))
			{
				System.out.println(hm.get(complement)+" "+i);				
			}
			hm.put(arr[i],i);
		}
	}
}
