/*
class Matrix2D
{
	public static void main(String[] args)
	{
		int mat[][]={{5,4},{3,2},{6,7}};
		int r=mat.length;
		int c=mat[0].length;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println(mat[0][0]+" "+mat[0][1]);
			}
		} 
	}
} */


class Matrix2D
{
	public static void main(String[] args)
	{
		int mat[][]={{5,4,3},{3,2,5},{6,7,6}};
		int r=mat.length;
		int c=mat[0].length;
		for(int j=0;j<c;j++)
		{
			System.out.println(mat[1][j]);
		}
		for(int i=0;i<r;i++)
		{
			System.out.println(mat[i][2]);
		}
	}
} 
