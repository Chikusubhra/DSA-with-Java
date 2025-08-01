class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = { 12, 13, 14, 15, 16, 23, 34, 45, 56, 78, 89, 90, 91, 92 };
        int target = 34;
        System.out.println(ans(arr, target));
    }

    static int ans(int arr[], int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int tempstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = tempstart;
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // ans
            }
        }
        return -1;
    }
}
