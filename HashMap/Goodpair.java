import java.util.*;
class Goodpair
{
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		int arr[]={1,2,3,1,2,3};
		int n=arr.length;
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int val=arr[i];
			if(hm.containsKey(val))
			{
				ans=ans+hm.get(val);
				hm.put(val,hm.get(val)+1);
			}
			else
			{
				hm.put(val,1);
			}
		}
		System.out.println(ans);
	}
}
