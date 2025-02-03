
class Operator
{
	public static void main(String[] args)
	{
		int ans=0;
		String op[]={"X++","++X","X--","--X"};
		for(int i=0;i<op.length;i++)
		{
			String temp=op[i];
			if(temp.equals("X++") || temp.equals("++X"))
			{
				ans=ans+1;
			}
			else
			{
				ans=ans-1;
			}
		}
		System.out.println(ans);
		
	}
}
