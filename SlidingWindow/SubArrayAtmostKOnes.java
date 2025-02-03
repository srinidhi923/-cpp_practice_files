//Max binary subArray length with atmost k ones

class SubArrayAtmostKOnes
{
    public static void main(String[] args)
    {
        int arr[]={0,1,3,1,1,6,7,1,0,1};
        int n=arr.length;
        int l=0;
        int k=2;
        int ans=0;
        int temp=0;
        for(int r=0;r<n;r++)
        {
            if(arr[r]==1)
            {
                temp++;
            }
            while(temp>k)
            {
                if(arr[l]==1)
                {
                    temp--;
                }
                l+=1;
            }
            
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
