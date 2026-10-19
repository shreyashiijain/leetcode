class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int no = nums[i];
            int a = 0;
            while(no>0){
                int digit = no%10;
                a = a + digit;
                no = no/10;
            }
            if(a<min){
                min = a;
            }
        }
        return min;
    }
}