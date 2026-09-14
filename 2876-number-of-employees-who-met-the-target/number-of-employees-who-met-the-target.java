class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] arr, int target) {
        int c = 0;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>=target){
                c++;
            }
        }
        return c;
    }
}