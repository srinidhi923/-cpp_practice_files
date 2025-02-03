import java.util.*;
class CountStr
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> hm=new HashMap<>();
		String arr[]={"hi","hello","hi","cat"};
		for(int i=0;i<arr.length;i++)
		{
			String val=arr[i];
			/*if(hm.containsKey(val))
			{
				int prev=hm.get(val);
				hm.put(val,prev+1);
			}
			else
			{
				hm.put(val,1);
			}*/
			hm.put(val,hm.getOrDefault(val,0)+1);
		}
		for(String boom:hm.keySet())
		{
			System.out.println(boom + " " + hm.get(boom));
		}
	}
}
