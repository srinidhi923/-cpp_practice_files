
//number of subarrays having atmost lessthan or equal to k odd numbers

class KoddSubArray
{
    public static void main(String[] args)
    {
        int arr[]={1,2,4,3,8};
        int l=0;
        int temp=0;
        int k=1;
        int ans=0;
        for(int r=0;r<arr.length;r++)
        {
            int val=arr[r];
            if(val%2==1)
            {
                temp++;
            }
            while(temp>k)
            {
                temp-=arr[l];
                temp--;
                l++;
            }
            ans+=r-l+1;
        }
        System.out.println(ans);
    }
}
