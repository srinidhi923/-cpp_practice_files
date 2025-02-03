
/*
//prints reverse diagnol
class Diagnol
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
			System.out.println(mat[i][j]);
			i++;
			j--;
		}
		
	}
}
*/

/*
class Diagnol
{
	public static void main(String[] args)
	{
		int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
		int r=mat.length;
		int c=mat[0].length;
		int i=0;
		int j=1;
		while(i<r && j<c)
		{
			System.out.println(mat[i][j]);
			i++;
			j++;
		}
		
	}
}
*/
// if all diagnol elements are 1 print true 

/*
class Diagnol
{
	public static void main(String[] args)
	{
		int mat[][]={{1,2,3},{4,1,6},{7,8,1}};
		int r=mat.length;
		int c=mat[0].length;
		boolean isvalid=true;
		int i=0;
		int j=0;
		while(i<r && j<c)
		{
			if(mat[i][j]!=1)
			{
				isvalid=false;
			}
			i++;
			j++;
		}
		System.out.println(isvalid);
	}
}
*/

//if all diagnol elements are equal print true 


class Diagnol
{
	public static void main(String[] args)
	{
		int mat[][]={{2,2,3},{4,2,6},{7,8,3}};
		int r=mat.length;
		int c=mat[0].length;
		boolean isvalid=true;
		int i=0;
		int j=0;
		int temp=mat[i][j];
		while(i<r && j<c)
		{
			if(mat[i][j]!=temp)
			{
				isvalid=false;
			}
			i++;
			j++;
		}
		System.out.println(isvalid);
	}
}





