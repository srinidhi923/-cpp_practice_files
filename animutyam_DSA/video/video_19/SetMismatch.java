import java.util.*;
class SetMismatch
{
	public static void main(String[] args)
	{
		HashSet <Integer> hs=new HashSet <>();
		int nums[]={1,2,3,3,5};
		int dup=0;
		for(int i=0;i<nums.length;i++)
		{
			int val=nums[i];
			if(hs.contains(val))
			{
				dup=val;	
			}
			else
			{
				hs.add(val);
			}
		}
		int missing=0;
		int n=nums.length;
		for(int i=0;i<n;i++)
		{
			if(!hs.contains(i))
			{
				missing=i;
			}
		}
		System.out.println(missing +" "+dup);
	}
}
