import java.util.*;
class Goodpair2
{
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		int arr[]={1,2,3,1,2,3,2};
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			int val=arr[i];
			hm.put(val,hm.getOrDefault(val,0)+1);
		}
		for(int boom:hm.keySet())
		{
			int n=hm.get(boom);
			ans=ans+(n*(n-1))/2;
		}
		System.out.println(ans);
	}
}
