class Solution {
    public int sumOfSquares(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(n%(i+1)==0){
                sum += arr[i]*arr[i];
            }
        }
        return sum;
    }
}