import java.util.*;
class ArrList
{
	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
		{
			ArrayList<Integer> temp=new ArrayList<>();
			temp.add(2);
			temp.add(3);
			
			arr.add(temp);
			
			ArrayList<Integer> temp2=new ArrayList<>();
			temp2.add(7);
			temp2.add(6);
			
			arr.add(temp2);
		}
		System.out.println(arr);
	}
}
