class Solution {
    public int[] findDegrees(int[][] arr) {
        int[] ans = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}