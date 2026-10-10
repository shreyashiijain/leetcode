class Solution {
    public int sumOfUnique(int[] arr) {
        int[] freq = new int[100];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]-1]++;
        }
        int sum = 0;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==1){
                sum += i+1;
            }
        }
        return sum;
    }
}