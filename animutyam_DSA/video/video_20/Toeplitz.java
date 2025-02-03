/*
class Toeplitz
{
	public static void main(String[] args)
	{
		int mat[][]={{1,2,3,4},{5,1,2,3}};
		int i=0;
		int j=0;
		Boolean isvalid=false;
		int r=mat.length;
		int c=mat[0].length;
		int temp=mat[i][j];
		while(i<r && j<c)
		{
			if(mat[i][j]==temp)
			{
				System.out.println("temp");
				int k=0;
				int l=1;
				int num=mat[k][l];
				while(k<r && l<c)
				{
					if(mat[k][l]==num)
					{
					System.out.println("num");
						int m=0;
						int n=2;
						int bum=mat[m][n];
						while(m<r && n<c)
						{
							if(mat[m][n]==bum)
							{
							System.out.println("bum");
								isvalid=true; 
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(isvalid);	
	}
}
-------------------------------------------------------------------------------------------------------------------
*/

class Toeplitz
{
	public boolean validfun(int[][] matrix,int x,int y)
	{
		int r=matrix.length;
		int c=matrix[0].length;
		int i=x;
		int j=y;
		int temp=matrix[i][j];
		boolean isvalid=true;
		while(i<r && j<c)
		{
			if(matrix[i][j]!=temp)
			{
				isvalid=false;
			}
			i++;
			j++;
		}
		System.out.println(isvalid);
	}
	
	public static void main(String[] args)
	{
		int mat[][]={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		int r=mat.length;
		int c=mat[0].length;
		boolean ans=true;
		for(int j=0;j<c;j++)
		{
			boolean temp=validfun(mat,0,j); 
			if(temp==false)
			{
				ans=false;
				break;
			}
		}
		for(int i=1;i<r;i++)
		{
			boolean temp=validfun(mat,i,0);
			if(temp==false)
			{
				ans=false;
				break;
			}
		}
		
		System.out.println(ans);
	}
}






























