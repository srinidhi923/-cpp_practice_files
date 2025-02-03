class JewelsStones
{
	public static void main(String[] args)
	{
		String stones="aAAbbb";
		String jewels="aA";
		int ans=0;
		for(int i=0;i<stones.length();i++)
		{
			char ch1=stones.charAt(i);
			for(int j=0;j<jewels.length();j++)
			{
				char ch2=jewels.charAt(j);
				if(ch1==ch2)
				{
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
