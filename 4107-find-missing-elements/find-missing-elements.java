class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer> a = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        Arrays.sort(arr);
        int in = 0;
        for (int i = min; i <= max; i++) {
            if (i != arr[in]) {
                a.add(i);
            } else {
                in++;
            }
        }
        return a;
    }
}