class Solution {
    public List<List<Integer>> fourSum(int[] arr, int tar) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (j > i+1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {
                   long sum = (long)arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == tar) {
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[k]);
                        quad.add(arr[l]);
                        ans.add(quad);
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    } else if (sum > tar) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}