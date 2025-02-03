//octal to decimal
class OctToDec
{
	public static int OctToDec(String octal)
	{
		int decimal=0;
		int  base=1;
		for(int i=octal.length()-1;i>=0;i--)
		{
			int digit=octal.charAt(i)-'0';
			decimal+=digit*base;
			base*=8;
		}
		return decimal;
	}
	public static void main(String[] args)
	{
		String octal="17";
		int decimalnum=OctToDec(octal);
		System.out.println(decimalnum);
	}
}
