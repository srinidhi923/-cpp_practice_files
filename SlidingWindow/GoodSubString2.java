import java.util.*;
class GoodSubString2
{
	public static void main(String[] args)
	{
		HashMap<Character,Integer> hm=new HashMap<>();
		String s="apole";
		int l=0;
		int sl=3;
		int ans=0;
		int n=s.length();
		for(int r=0;r<n;r++)
		{
			char ch=s.charAt(r);
			hm.put(ch,hm.getOrDefault(ch,0)+1);
			
			if(r-l==sl)
			{
				char tch=s.charAt(l);
				hm.put(tch,hm.get(tch)-1);
				if(hm.get(tch)==0)
				{
					hm.remove(tch);
				}
				l++;
			}
			if(hm.size()==sl)
			{
				ans+=1;
			}
		}
		System.out.println(ans);
		
	}
}
