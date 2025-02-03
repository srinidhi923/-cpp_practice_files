//count number of nice subArrays

class NiceSubArray
{
    public static void main(String[] args)
    {
        int arr[]={1,1,2,1,1};
        int n=arr.length;
        int l=0;
        int temp=0;
        int k=2;
        int ans=0;
        for(int r=0;r<n;r++)
        {
            int val=arr[r];
            if(val%2==1)
            {
                temp++;
            }
            while(temp>k)
            {
                int lval=arr[l];
                if(lval%2==1)
                {
                    temp--;
                }
                l++;
            }
            ans+=r-l+1;
        }
        System.out.println(ans);
    }
}

