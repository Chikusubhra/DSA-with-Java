class maxWealth {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {3,2,1}
        };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int accounts[][]){
        int ans=Integer.MIN_VALUE;
        for (int num[] : accounts) { //for(int row=0;row<accounts.length;row++){}
            int sum=0;
            for (int antInt: num) { //for(int col=0;col<accounts[row].length;col++){}
                // sum += accounts[row][col];
                sum = sum + antInt;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
