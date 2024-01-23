public class ValidPalindrome {
    public static void main(String[] args) {

        String[] testCase = {
                "DEBASHREE",
                "CHANDAN",
                "UMANG",
                "MADAM",
                "KALAK"
        };
        for (int k = 0; k < testCase.length; k++) {
            System.out.println("Test Case # " + (k + 1));
            System.out.println(checkPalindrome(testCase[k]));
            //System.out.println(new String(new char[100]).replace('\0', '-'));

        }
    }
    public static boolean checkPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left <  right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
