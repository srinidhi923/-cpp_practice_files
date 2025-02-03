import java.util.*;
class Xdivisors
{
	public static int countDiv(int num)
	{
		int count=0;
		for(int i=1;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				count++;
				 if (i != num / i) 
				 { 
                   			 count++;
				 }
			}
		}
		return count;
	}
	public static List<Integer> findXdiv(int x,int limit)
	{
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=1;i<=limit;i++)
		{
			if(countDiv(i)==x)
			{
				ans.add(i);
			}
		}
		return ans;
	}
	public static void main(String[] args)
	{
		int limit=50;
		int x=6;
		List<Integer> numDiv=findXdiv(x,limit);
		System.out.println(numDiv);
	}
}
