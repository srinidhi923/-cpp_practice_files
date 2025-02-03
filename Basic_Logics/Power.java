class Power
{
	public static void main(String[] args)
	{
		double base=2;
		double exponent=5;
		double res=1;
		while(exponent!=0)
		{
			res=res*base;
			exponent--;
		}
		System.out.println(res);
		//System.out.println(Math.pow(base,exponent));
	}
}

