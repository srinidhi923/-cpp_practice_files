import java.util.*;
class GoodSubString
{
	public static boolean fun(String s,int sl)
	{
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			hs.add(ch);
		}
		if(hs.size()==sl)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args)
	{
		int sl=4;
		int ans=0;
		String s="aopleasdfg";
		int n=s.length();
		for(int i=0;i<n-sl+1;i++)
		{
			boolean temp=fun(s.substring(i,i+sl),sl);
			if(temp==true)
			{
				ans+=1;
			}
		}
		System.out.println(ans);
	}
}
