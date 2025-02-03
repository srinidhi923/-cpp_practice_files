import java.util.*;
class DecodeMsg
{
	public static void main(String[] args)
	{
		HashMap<Character,Character> hm=new HashMap<>();
		String key="the quick brown fox jumps over the lazy dog";
		String msg="vkbs bs t suepuv";
		int temp=97;
		for(int i=0;i<key.length();i++)
		{
			char ch=key.charAt(i);
			if(ch!=' '&&!hm.containsKey(ch))
			{
				hm.put(ch,(char)temp);
				temp++;
			}
		}
		String ans="";	
		for(int i=0;i<msg.length();i++)
		{
			char ch=msg.charAt(i);
			if(ch!=' ')
			{
				char val=hm.get(ch);
			 	ans+=val;
			}
			else
			{
				ans+=' ';
			}
		}
		System.out.println(ans);
	}	
}
