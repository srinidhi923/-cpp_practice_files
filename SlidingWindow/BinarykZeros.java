
//Max binary subArray length with atmost k zeroes

class BinarykZeros
{
    public static void main(String[] args)
    {
        int arr[]={1,1,1,0,0,1,0};
        int n=arr.length;
        int l=0;
        int k=2;
        int ans=0;
        int temp=0;
        for(int r=0;r<n;r++)
        {
            if(arr[r]==0)
            {
                temp++;
            }
            while(temp>k)
            {
                if(arr[l]==0)
                {
                    temp--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}







