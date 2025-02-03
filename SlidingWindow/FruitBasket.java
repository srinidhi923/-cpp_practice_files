//fruit into basket 

import java.util.*;
class FruitBasket
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,2,2};
		int n=arr.length;
		int l=0;
		int ans=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int r=0;r<n;r++)
		{
			int val=arr[r];
			hm.put(val,hm.getOrDefault(val,0)+1);
			
			while(hm.size()>2)
			{
				int lval=arr[l];
				hm.put(lval,hm.get(lval)-1);
				if(hm.get(lval)==0)
				{
					hm.remove(lval);
				}
				l++;
			}
			ans=Math.max(ans,r-l+1);
		}
		System.out.println(ans);
	}
}
