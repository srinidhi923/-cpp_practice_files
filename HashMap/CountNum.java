import java.util.*;
class CountNum
{
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		int arr[]={3,4,5,3,4,5};
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
			System.out.println(boom + " " + hm.get(boom));
		}
	}
}
