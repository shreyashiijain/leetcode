class Solution {
    public int reverseDegree(String s) {
        
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            ans =(i+1)*('z'-s.charAt(i)+1)+ans;
        }
        return ans;
    }
}