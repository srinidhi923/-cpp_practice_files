/*
import java.util.*;
class SearchNumber
{
	public static void main(String[] args)
	{
		HashMap <Integer,Integer> hm= new HashMap <>();
		int arr[]={10,8,5,4,3,2,1,7};
		int key=3;
		for(int i=0;i<arr.length;i++)
		{
			int val=arr[i];
			if(hm.containsKey(val))
			{
				int ans=hm.get(val);
				if(ans==key)
				{
					System.out.println("found");
				}	
			
			}
			else
			{
				hm.put(val,0);
			}
		}	 
	}
}
*/

import java.util.*;
class SearchNumber
{
	public static void main(String[] args)
	{
		HashSet <Integer> hs=new HashSet <>();
		hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(1);
		hs.add(3);
		hs.add(10);
		hs.remove(6);
		hs.remove(1);
		hs.remove(3);
		if(hs.contains(1))
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
		System.out.println(hs.size());
		System.out.println(hs);
	}
}

























