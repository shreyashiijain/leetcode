class Solution {
    public List<Integer> targetIndices(int[] arr, int k) {
        List< Integer> ans = new ArrayList<>();
        int small=0;
        int equal=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<k){
                small++;
            }
            else if(arr[i]==k){
                equal++;
            }
        }
        if(equal == 0 ){
            return ans;
        }
        else if(small == (small+equal-1)){
            ans.add(small);
        }
        else{
            for (int i = small; i <= small+equal-1; i++) {
                ans.add(i);
            }
        }
        return ans;
    }
}