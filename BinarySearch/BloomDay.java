class Solution {
    public static boolean isPossible(int arr[], int m, int k, int day) {
        int took = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] <= day) 
            {
                took++;
                if (took == k) 
                { // Make a bouquet
                    m--;
                    took = 0;
                }
                if (m == 0) 
                {
                    return true;
                }
            }
             else 
            {
                took = 0; // Reset if flowers are not consecutive
            }
        }
        return false;
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        int l = 1, r = (int) Math.pow(10, 9);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(bloomDay, m, k, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        int exed=(int)Math.pow(10,9);
        if(l==exed+1)
        {
            return -1;
        }
        return l;
    }
}

