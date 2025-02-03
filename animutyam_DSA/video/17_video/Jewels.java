

import java.util.*;
class Jewels
{
	public static void main(String[] args)
	{
		String jewels="aA";
		String stones="aAAbbb";
		HashMap <Character,Integer> hm=new HashMap <>();
		for(int i=0;i<stones.length();i++)
		{
			char ch=stones.charAt(i);
			if(hm.containsKey(ch))
			{
				int prev=hm.get(ch);
				hm.put(ch,prev+1);
			}
			else
			{
				hm.put(ch,1);
			}
		}
		int ans=0;
		for(int j=0;j<jewels.length();j++)
		{
			char jw=jewels.charAt(j);
			if(hm.containsKey(jw))	
			{
				ans+=hm.get(jw);
			}
		}
		System.out.print(ans);
	}
}
