import java.util.*;
class SubString2
{
	public static void main(String[] args)
	{
		String s="apple";
		int n=s.length();
		List<String> arr=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				String temp=s.substring(i,j+1);
				arr.add(temp);
			}
		}
		System.out.println(arr);
	}
}

