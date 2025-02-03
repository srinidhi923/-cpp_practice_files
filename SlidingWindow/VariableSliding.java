class VariableSliding
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int l=0;
        int ans=0;
        int temp=0;
        int k=10;
        for(int r=0;r<arr.length;r++)
        {
            temp+=arr[r];
            while(temp>k)
            {
                temp-=arr[l];
                l++;
            }
                ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
