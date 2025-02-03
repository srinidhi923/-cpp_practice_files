class Matrix
{
	public static void main(String[] args)
	{
		int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
		int r=mat.length;
		int c=mat[0].length;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					System.out.println(mat[i][j]);
				}
			}
		}
	}
}
