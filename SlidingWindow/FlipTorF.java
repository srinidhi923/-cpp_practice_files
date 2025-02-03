class FlipTorF
{
	public static void main(String[] args)
	{
		String answerKey="TTFF";
		int l=0;
		int k=2;
		int ans=0;
		int cntF=0;
		int cntT=0;
		for(int r=0;r<answerKey.length();r++)
		{
			char ch=answerKey.charAt(r);
			if(ch=='F')
			{
				cntF++;
			}
			else
			{
				cntT++;
			}
			while(Math.min(cntF,cntT)>k)
			{
				char ch1=answerKey.charAt(l);
				if(ch1=='F')
				{
					cntF--;
				}
				else
				{
					cntT--;
				}
				l++;
			}
			ans=Math.max(ans,r-l+1);
		}
		System.out.println(ans);
	}
	
}
