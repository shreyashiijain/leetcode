class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                return true;
            }
            map.put(arr[i],1);
        }
        return false;
    }
}