//binary to decimal
class BinToDec
{
	public static int binToDec(String binary)
	{
		int decimal=0;
		int base=1;
		for(int i=binary.length()-1;i>=0;i--)
		{
			int bit=binary.charAt(i)-'0';
			decimal+=bit*base;
			base*=2;	
		}
		return decimal;
	}
	public static void main(String[] args)
	{
		String binarynum="1011";
		int ans=binToDec(binarynum);
		System.out.println(ans);
	}
}
