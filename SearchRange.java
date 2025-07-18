class SearchRange {
    public static void main(String[] args) {
        int arr[]={12,11,-11,23,54,65};
        int target=-11;
        System.out.println(srange(arr, target, 1, 3));
    }
    static boolean srange(int arr[],int target,int start,int end){
        if(arr.length==0){
            return false;
        }
        for (int i = start; i <= end; i++) {
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }
}
