class Solution {
    public int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[Math.abs(arr[i])-1]<0) {
                return Math.abs(arr[i]);
            }
            else{
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            }
        }
        return 0;
    }
}