class Solution {
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int in = arr[i]-1;
            if((arr[i]>0 && arr[i]<=arr.length )&& arr[i]!=arr[in]){
                int temp = arr[i];
                arr[i] = arr[in];
                arr[in] = temp;
            }
            else{
                i++;
            }
        }
        for (int ji = 0; ji < arr.length; ji++) {
            if(arr[ji]!=ji+1){
                return ji+1;
            }
        }
        return arr.length+1;
    }
}