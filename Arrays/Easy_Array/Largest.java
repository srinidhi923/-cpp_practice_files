import java.util.*;
public class Largest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println("largest element is: ");
		System.out.println(largest+" ");
		sc.close();
	}
}
