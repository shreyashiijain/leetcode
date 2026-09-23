class Solution {
    public int splitArray(int[] arr, int k) {
        if (arr.length < k) {
            return -1;
        }
        int ans = -1;
        int high = 0;
        int low = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
            low = Math.max(low,arr[i]);
        }
        while(high>=low){
            int mid = low + (high - low) / 2;
            if(timeTaken(arr,mid)<=k){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    private static int timeTaken(int[] arr, int mid) {
        int log = 1;
        int tem = 0;
        for (int i = 0; i < arr.length; i++) {
            if(tem+arr[i]<=mid){
                tem+=arr[i];
            }
            else{
                tem = arr[i];
                log++;
            }
        }
        return log;
    }
}