public class ValidPalindromeRemovingAChar {
    public static boolean testPalindrome(String s){
        int left = 0;
        int right = s.length() -1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return checkPalindrome(s, left + 1, right) || checkPalindrome(s, left, right - 1); //if removing one character from the word
            }
            left ++;
            right --;
        }
        return true;
    }
    public static boolean checkPalindrome(String s, int low, int high){
        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low ++;
            high --;
        }
        return true;
    }
    public static void main(String[] args) {
        String input1 = "racecar";
        String input2 = "abca";
        String input3 = "hello";

        System.out.println(testPalindrome(input1)); // true
        System.out.println(testPalindrome(input2)); // true
        System.out.println(testPalindrome(input3)); // false
    }
}
