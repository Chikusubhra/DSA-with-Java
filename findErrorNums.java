import java.util.Arrays;

class findErrorNums {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 4, 5 };
        System.out.println(Arrays.toString(findError(arr)));
    }

    static int[] findError(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapArr(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[] { arr[j], j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swapArr(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
