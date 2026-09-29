class Solution {
    public int countNegatives(int[][] arr) {
        int a = 0;
        int row = arr.length-1;
        int col = arr[row].length-1;
        int i = 0;
        int j = col;
        while(i<=row && j>=0){
            int mid = arr[i][j];
            if(mid<0){
                j--;
                a += (row-i+1);
            }
            else{
                i++;
            }
        }
        return a;
    }
}