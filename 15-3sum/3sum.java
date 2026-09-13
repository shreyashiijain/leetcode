class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1])
                continue;
            int k = arr.length-1;
            int j = i+1;
            while(j<k){
                if (arr[i] + arr[j] + arr[k] == 0) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[j]);
                    triplet.add(arr[k]);
                    k--;
                    j++;
                    ans.add(triplet);
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }
                else if (arr[i] + arr[j] + arr[k] > 0) {
                    k = k - 1;
                }
                else {
                    j = j + 1;
                }
            }
        }
        return ans; 
    }
}