import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int arr[]=new int[5];
        // System.out.println("enter input to array");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("Enter input for search");
        // int inp=sc.nextInt();
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("search idx "+i);
        //     if(arr[i]==inp){
        //         System.out.println("found number at idx "+i);
        //         break;
        //     }
        // }
        int nums[]={23,45,1,4,-6,16,-11};
        int target=1;
        int ans=LinearSearch(nums,target);
        System.out.println(ans);

    }

    static int LinearSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
