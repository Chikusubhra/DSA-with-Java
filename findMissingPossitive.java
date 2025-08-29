class findMissingPossitive {
    public static void main(String[] args) {
        int arr[] = { 3, 4, -1, 1 };
        System.out.println(missing(arr));
    }

    static int missing(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] != arr[correct]) {
                swapArr(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;
    }

    static void swapArr(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
