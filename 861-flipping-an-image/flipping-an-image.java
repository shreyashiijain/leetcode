class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int i = 0;
        //flip
        while( i < arr.length ){
            int ji = 0;
            int jj = arr.length-1;
            while(ji<jj) {
                int temp = arr[i][jj];
                arr[i][jj] = arr[i][ji];
                arr[i][ji] = temp;
                ji++;
                jj--;
            }
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                if(arr[j][k]==0){
                    arr[j][k] = -1;
                }
                else if(arr[j][k]==1){
                    arr[j][k] = 0;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                if(arr[j][k]==-1){
                    arr[j][k] = 1 ;
                }
            }
        }
        return arr;
    }
}