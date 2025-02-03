class QuadracticRoots
{
	public static void findRoots(int a,int b,int c)
	{
		int dis=(b*b)-4*a*c;
		if(dis>0)
		{
			double root1=-b+Math.sqrt(dis)/2*a;
			double root2=-b-Math.sqrt(dis)/2*a;
			System.out.println("roots are real and distinct");
			System.out.println(root1+" "+root2);
		}
		else if(dis==0)
		{
			double root=-b/(2*a);
			System.out.println("roots are real");
			System.out.println(root);
		}
		else
		{
			double realpart=-b/(2*a);
			double imaginary=Math.sqrt(-dis)/(2*a);
			System.out.println("roots are imaginary and complex");
			System.out.println(realpart+" "+imaginary);
		}
	}
	public static void main(String[] args)
	{
		int a=1;
		int b=2;
		int c=5;
		findRoots(a,b,c);
	}
}
