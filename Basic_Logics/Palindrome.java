//check palindrome
class Palindrome
{
	public static void main(String[] args)
	{
		int num=12345;
		int rev=0;
		int rem;
		int temp;
		temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
