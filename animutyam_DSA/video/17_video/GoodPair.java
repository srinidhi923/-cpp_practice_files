
//-----------Brute force using For Loop----------------

/*
class GoodPair
{
	public static void main(String[] args)
	{
		int arr[]={2,3,4,2,1,4,2,3,1};
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
	*/
	
//-----------using Hashing-----------


/*	import java.util.*;
	class GoodPair
	{
		public static void main(String[] args)
		{
			HashMap <Integer,Integer> hm=new HashMap <>();
			int arr[]={2,3,4,2,1,4,2,3,1};
			int n=arr.length;
			int ans=0;
			for(int i=0;i<n;i++)
			{
				if(hm.containsKey(arr[i]))
				{
					ans=ans+hm.get(arr[i]);
					hm.put(arr[i],hm.get(arr[i])+1);	
				}
				else
				{
					hm.put(arr[i],1);
				}
			}
			System.out.println(ans);
		}
	}
	
	*/
	
	import java.util.*;
	class GoodPair
	{
		public static void main(String[] args)
		{
			HashMap <Integer,Integer> hm=new HashMap <>();
			int arr[]={2,3,4,2,1,4,2,3,1};
			int n=arr.length;
			int count=0;
			for(int i=0;i<n;i++)
			{
				int val=arr[i];
				if(hm.containsKey(val))
				{
					int prev=hm.get(val);
					hm.put(val,prev+1);
				}
				else
				{
					hm.put(val,1);
				}
			}
			for(int boom:hm.keySet())
			{
				int m=hm.get(boom);
				count=count+(m*(m-1))/2;
			}
			System.out.println(count);
		}
	}
	
	
	
	
	
	
	
	
	
	
