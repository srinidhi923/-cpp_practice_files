class Diagnol
{
	public static void main(String[] args)
	{
	int mat[][]={{2,3,4},{1,2,3},{6,7,8}};
	int r=mat.length;
	int c=mat[0].length;
	int n=3;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j || i+j==n-1)
				{
					System.out.println(mat[i][j]);
				}
				
			}
		}
	}
}

-----------------------------------------------------------------------------

class RevDiagnol
{
	public static void main(String[] args)
	{
		int mat[][]={{2,3,4},{5,6,7},{1,2,3}};
		int r=mat.length;
		int c=mat[0].length;
		for(int i=0;i<r;i++)
		{
			int j=c-i-1;
			System.out.println(i+ " " + j) ;
		}
	}
}

----------------------------------------------------
//using while loop

class RevDiagnol
{
	public static void main(String[] args)
	{
		int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
		int r=mat.length;
		int c=mat[0].length;
		int i=0;
		int j=c-1;
		while(i<r && j>=0)
		{
			System.out.println(i+" "+j);
			//System.out.println(mat[i][j]);
			i++;
			j--;
		}
	}
}
