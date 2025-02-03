
//Dutch national flag algorithm
class SortColours
{
	public static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}


	public static void main(String[] args)
	{
		int arr[]={2,0,2,1,1,0};
		int n=arr.length;
		int low=0;
		int mid=0;
		int high=n-1;
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				swap(arr,low,mid);
				low++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else
			{
				swap(arr,mid,high);
				high--;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
