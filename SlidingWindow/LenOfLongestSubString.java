//longest substring without repeating characters

import java.util.*;
class LenOfLongestSubString
{
	public static void main(String[] args)
	{
		HashSet<Character> hs=new HashSet<>();
		String s="abcacdb";
		int l=0;
		int ans=0;
		for(int r=0;r<s.length();r++)
		{
			char ch=s.charAt(r);
			if(!hs.contains(ch))
			{
				hs.add(ch);
			}
			else
			{
				while(hs.contains(ch))
				{
					hs.remove(s.charAt(l));
					l++;
				}	
				hs.add(ch);
			}
			ans=Math.max(ans,r-l+1);
		}
		System.out.println(ans);
	}
}
