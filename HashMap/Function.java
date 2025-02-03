//passing hashmap as parameter into function

import java.util.*;
class Function
{
	public static boolean fun(HashMap<Integer,Integer> hma , HashMap<Integer,Integer> hmb)
	{
		if(hma.size()!=hmb.size())
		{
			return false;
		}
		for(int key:hma.keySet())
		{
			if(!hmb.containsKey(key))
			{
				return false;
			}
			int a=hma.get(key);
			int b=hmb.get(key);
			if(a!=b)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		HashMap<Integer,Integer> hma=new HashMap<>();
		hma.put(9,40);
		hma.put(3,50);
		HashMap<Integer,Integer> hmb=new HashMap<>();
		hmb.put(2,40);
		hmb.put(3,50);
		System.out.println(fun(hma,hmb));
		
	}
}
