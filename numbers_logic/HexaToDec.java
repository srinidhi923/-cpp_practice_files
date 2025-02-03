class HexaToDec
{
	public static int hexaToDec(String hexa)
	{
		int decimal=0;
		int base=1;
		hexa=hexa.toUpperCase();
		for(int i=hexa.length()-1;i>=0;i--)
		{
			char digit=hexa.charAt(i);
			int digitvalue=0;;
			if(digit>='0' && digit<='9')
			{
				digitvalue=digit-'0';
			}
			else if(digit>='A' && digit<='F')
			{
				digitvalue=digit-'A'+10;
			}
			else
			{
				System.out.println("invalid");
			}
			decimal+=digitvalue*base;
			base*=16;
		}
		return decimal;
	}
	public static void main(String[] args)
	{
		String hexa="1A3";
		int ans=hexaToDec(hexa);
		System.out.println(ans);
	}
}
