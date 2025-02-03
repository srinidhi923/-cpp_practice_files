class Hello
{
	public static void main(String[] args)
	{
		String s="madam";
		boolean palindrome=true;
		int n=s.length();
		for(int i=0;i<n/2;i++)
		{
			if(s.charAt(i)!=s.charAt(n-i-1))
			{
				palindrome=false;
				break;
			}
		}
		if(palindrome)
		{
			System.out.println("yes, it is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	
}
