class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                even++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(even>0){
                nums[i] = 0;
                even--;
            }
            else{
                nums[i] = 1;
            }
        }
        return nums;
    }
}