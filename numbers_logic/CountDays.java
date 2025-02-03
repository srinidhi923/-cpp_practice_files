import java.util.*;
class CountDays
{
	public static boolean isLeap(int year)
	{
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			return true;
		}
		return false;
	}
	public static int noOfDays(int month,int year)
	{
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				 if(isLeap(year))
				 {
				 	return 29;
				 }
				 else
				 {
				 	return 28;
				 }
			default:
				return -1;
		}
	}
	public static void main(String[] args)
	{
		int year=2024;
		int month=2;
		int days=noOfDays(month,year);
		if(days==-1)
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println(days);
		}
		
	}
	
}
