import java.util.Scanner;
import java.util.Arrays;
class ReverseArr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter inputs into array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));
        for (int i = 0;i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}