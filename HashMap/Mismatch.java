import java.util.*;
class Mismatch
{
	public static void main(String[] args)
	{
		HashSet<Integer> hs=new HashSet<>();
		int arr[]={5,6,6,8};
		int n=arr.length;
		int dup=0;
		for(int i=0;i<arr.length;i++)
		{
			int val=arr[i];
			if(!hs.contains(val))
			{
				hs.add(val);
			}
			else
			{
				dup=val;
			}
		}
		int missing=-1;
		for(int i=0;i<=n;i++)
		{
			if(!hs.contains(i))
			{
				missing=i;
			}
		}
		System.out.println("duplicate is:" +" "+ dup);
		System.out.println("missing is:" +" "+ missing);
		
	}
}
