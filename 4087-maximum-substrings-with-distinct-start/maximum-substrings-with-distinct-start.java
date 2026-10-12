class Solution {
    public int maxDistinct(String s) {
        int [] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            arr[a-'a']++;
        }
        int dis = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                dis++;
            }
        }
        return dis;
    }
}