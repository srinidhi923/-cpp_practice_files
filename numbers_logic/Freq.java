import java.util.*;
class Freq
{
	public static void main(String[] args)
	{
		String s="1234512425161";
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int digit=Character.getNumericValue(ch);
			hm.put(digit,hm.getOrDefault(digit,0)+1);
		}
		for(int key:hm.keySet())
		{
			System.out.println(key+"->"+hm.get(key));
		}
	}
}
