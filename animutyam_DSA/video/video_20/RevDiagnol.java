class RevDiagnol
{
	public static void main(String[] args)
	{
		int mat[][]={{1,2,3,4},{4,5,6,3},{7,8,9,2}};
		int r=mat.length;
		int c=mat[0].length;
		int i=1;
		int j=0 ;
		while(i<r && j<c)
		{
			System.out.println(mat[i][j]);
			i++;
			j++;
		}
	}
}
