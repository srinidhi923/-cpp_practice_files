class D1
{
	public static void main(String[] args)
	{
		int mat[][]={{11,2,3},{2, 1,3},{3,9,11}};
		int r=mat.length;
		int c=mat[0].length;
		Boolean isvalid=true;
		int i=1;
		int j=0;
		int temp=mat[i][j];
		while(i<r && j<c)
		{
			if(mat[i][j]!=temp)
			{
				isvalid=false;
				break;
			}
			i++;
			j++;
		}
		System.out.println(isvalid);
	}
}
