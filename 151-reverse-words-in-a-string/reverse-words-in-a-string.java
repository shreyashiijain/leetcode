class Solution {
    public String reverseWords(String s) {
        String [] str = s.split(" ");
        String ans = "";
        for (int i = str.length-1; i >= 0; i--) {
            if(str[i].isBlank()){
                continue;
            }
            else {
                ans = ans.concat(str[i] + " ");
            }
        }
        return ans.stripTrailing(); 
    }
}