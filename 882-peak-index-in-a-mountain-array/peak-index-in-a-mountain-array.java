class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1;
        int high = arr.length - 2;
        if (arr[0] > arr[1]) {
            return 0;
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            return arr.length - 1;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1]) {
                if (arr[mid] > arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] < arr[mid - 1]) {
                high = mid - 1;
            }
        }

        return -1;
    }
}