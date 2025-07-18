import java.util.Arrays;

class SearchString {
    public static void main(String[] args) {
        String str="chiku";
        char target='k';
        // System.out.println(search(str, target));
        // System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(search2(str, target));
    }
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    } 
}
