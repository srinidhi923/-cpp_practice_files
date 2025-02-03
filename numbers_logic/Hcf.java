//hcf and gcd are same

class Hcf
{
	public static int calcHCF(int a,int b)
	{
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static void main(String[] args)
	{
		int num1=12;
		int num2=8;
		int hcf=calcHCF(num1,num2);
		System.out.println(hcf);
	}
}
