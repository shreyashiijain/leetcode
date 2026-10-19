class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int k) {
        List<Boolean> a = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]+k>=max){
                a.add(true);
            }
            else{
                a.add(false);
            }
        }
        return a;
    }
}