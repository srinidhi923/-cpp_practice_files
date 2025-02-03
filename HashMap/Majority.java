import java.util.*;
class Majority
{
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		int arr[]={3,4,5,3,3,3};
		int n=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			int val=arr[i];
			if(hm.containsKey(val))
			{
				int prev=hm.get(val);
				hm.put(val,prev+1);
			}
			else
			{
				hm.put(val,1);
			}
		}
		for(int boom:hm.keySet())
		{
			if(hm.get(boom)>n/2)
			{
				System.out.println("majority element is:"+ " " + boom);
			}
		}
	}
}
