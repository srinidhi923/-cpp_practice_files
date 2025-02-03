//check 2 hashmaps are equal or not 

import java.util.*;
class EqualMap
{
	public static boolean fun(HashMap<Integer,Integer> hm1,HashMap<Integer,Integer> hm2)
	{
		if(hm1.size()!=hm2.size())
		{
			return false;
		}	
		for(int key:hm1.keySet())
		{
			if(!hm2.containsKey(key))
			{
				return false;
			}
			int a=hm1.get(key);
			int b=hm2.get(key);
			if(a!=b)
			{
				return false;
			}
		}
		return true;
	}	
	
	
	
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> hm1=new HashMap<>();
		hm1.put(2,200);
		hm1.put(3,900);
		
		HashMap<Integer,Integer> hm2=new HashMap<>();
		hm2.put(3,300);
		hm2.put(2,200);
		
		System.out.println(fun(hm1,hm2));	
	}
}
