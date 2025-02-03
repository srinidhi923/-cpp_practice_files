import java.util.*;
class JewelsStones
{
	public static void main(String[] args)
	{
		HashMap <Character,Integer> hm=new HashMap <>();
		String jewels="aA";
		String stones="aAAbbb";
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
			char ch=jewels.charAt(j);
			if(hm.containsKey(ch))
			{
				ans=ans+hm.get(ch);
			}
		}
		System.out.println(ans);
	}
}
