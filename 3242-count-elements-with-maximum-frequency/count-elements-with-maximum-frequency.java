class Solution {
    public int maxFrequencyElements(int[] arr) {
        int [] freq = new int[101];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int max = -1;
        int frequency = 1;
        for (int i = 0; i < freq.length; i++) {
            if(max<freq[i]){
                max = Math.max(freq[i],max);
                frequency = 1;
            }
            else if(max == freq[i]){
                frequency++;
            }
        }
        return max * frequency;
    }
}