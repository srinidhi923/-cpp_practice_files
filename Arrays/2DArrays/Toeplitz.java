class Toeplitz
{
	public boolean validfun(int matrix[][],int x,int y)
	{
		int i=x;
		int j=y;
		int r=matrix.length;
		int c=matrix[0].length;
		int temp=matrix[i][j];
		boolean valid=true;
		while(i<r && j<c)
		{
			if(matrix[i][j]!=temp)
			{
				valid=false;
				break;
			}
			i++;
			j++;
		}
		return valid;
	}
	public static void main(String[] args)
	{
		int matrix[][]={{1,3,3,4},{5,1,2,3},{9,5,1,2}};
		boolean ans=true;
		int r=matrix.length;
		int c=matrix[0].length;
		Toeplitz toeplitz=new Toeplitz();
		for(int j=0;j<c;j++)
		{
			boolean temp=toeplitz.validfun(matrix,0,j);
			if(temp==false)
			{
				ans=false;
				break;
			}
		}
		for(int i=0;i<r;i++)
		{
			boolean temp=toeplitz.validfun(matrix,i,0);
			if(temp==false)
			{
				ans=false;
				break;
			}
		}
		System.out.println(ans);
	} 
}
