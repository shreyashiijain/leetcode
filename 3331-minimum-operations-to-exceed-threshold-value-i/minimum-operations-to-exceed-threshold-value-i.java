class Solution {
    public int minOperations(int[] arr, int k) {
        int c = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>=k){
                c++;
            }
        }
        return arr.length - c;
    }
}