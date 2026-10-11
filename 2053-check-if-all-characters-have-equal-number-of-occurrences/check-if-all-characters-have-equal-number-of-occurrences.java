class Solution {
    public boolean areOccurrencesEqual(String a) {
        int [] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            arr[b-'a']++;
        }
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                freq = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]!=freq) && arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}