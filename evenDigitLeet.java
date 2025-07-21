class evenDigitLeet {
    public static void main(String[] args) {
        int arr[] = { 12, 134, 1, 33, 2321, 212121 };
        // System.out.println(digits(13214));
        // System.out.println(even(133));
        System.out.println(findNums(arr));
    }

    static int findNums(int nums[]) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int noOfDigit = digits(num);
        if (noOfDigit % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
        /*
        int count = 0;
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
        */
        
        
    }
}