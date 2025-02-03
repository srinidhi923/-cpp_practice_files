//check given 2 strings are anagrams or not 

import java.util.*;
class StringAnagram
{
	public static boolean fun(HashMap<Character,Integer> hm1 , HashMap<Character,Integer> hm2)
	{
		if(hm1.size()!=hm2.size())
		{
			return false;
		}
		
		for(char key:hm1.keySet())
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
		String s="abdcd";
		String r="dbeda";
		HashMap<Character,Integer> hm1=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);
		}
		
		
		HashMap<Character,Integer> hm2=new HashMap<>();
		for(int i=0;i<r.length();i++)
		{
			char ch2=r.charAt(i);
			hm2.put(ch2,hm2.getOrDefault(ch2,0)+1);
		}
		System.out.println(fun(hm1,hm2));
	}
}
