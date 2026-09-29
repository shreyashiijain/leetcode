class Solution {
    public int mySqrt(int k) {
        long low = 1;
        long high = k;
        long ans = 0;
        while(low<=high){
            long mid = (low+high)/2;
            if(mid*mid<=k){
                 ans = mid;
                 low = mid +1;
            }
            else {
                high=mid-1;
            }
        }
        int sq = (int)ans;
        return sq;
    }
}