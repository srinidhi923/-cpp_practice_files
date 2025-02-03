
//Max binary subArray length with atmost k odd numbers

class SubArrayAtmostKodd
{
    public static void main(String[] args)
    {
        int arr[]={12,1,3,1,1,6,7,1,8,1};
        int n=arr.length;
        int l=0;
        int k=2;
        int ans=0;
        int temp=0;
        for(int r=0;r<arr.length;r++)
        {
            if(arr[r]%2==1)
            {
                temp++;
            }
            while(temp>k)
            {
                if(arr[l]%2==1)
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
