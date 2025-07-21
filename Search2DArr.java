import java.util.Arrays;

class Search2DArr {
    public static void main(String[] args) {
        int arr[][]={
            {23,1,43},
            {18,33,12,3},
            {78,99,80,34},
            {18,12}
        };
        int target=12;
        // int ans[]=search2d(arr, target);
        // System.out.println(Arrays.toString(ans));
        // System.out.println(search2d(arr, target));
        System.out.println(max(arr));
    }
    // static int search2d(int arr[][],int target){
    //     for (int row = 0; row < arr.length; row++) {
    //         for (int col = 0; col < arr[row].length; col++) {
    //             if(arr[row][col] == target){
    //                 return 1;
    //             }
    //         }
    //     }
    //     return -1;
    // }

    // static int[] search2d(int arr[][],int target){
    //     for (int row = 0; row < arr.length; row++) {
    //         for (int col = 0; col < arr[row].length; col++) {
    //             if(arr[row][col] == target){
    //                 return new int[]{row,col};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }

    static int max(int arr[][]){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
