public class IsPalindrome {

    /**
     * solution1:
     * tc: O(N)
     * sc: O(N) - due to String conversion
     */
//    public static boolean isPalindrome(int x) {
//        String s = String.valueOf(x);
//        int left = 0, right = s.length() - 1;
//
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }

    /**
     * solution2:
     * using built-in
     * tc: O(N)
     * sc: O(N) -> using collections
     */
//    public static boolean isPalindrome(int x){
//        String s = String.valueOf(x);
//        return new StringBuilder(s).reverse().toString().equals(s);
//    }

    /**
     * /**
     * solution3:
     * palindrome of int without converting to string
     * Time: O(log10 x) == O(D) where D = #digits in x (loop runs ~D/2 times)
     * Space: O(1)
     */

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && (x % 10 == 0))) return false;

        int revHalf = 0;
        while (x > revHalf) {
            revHalf = revHalf * 10 + x % 10;
            x = x / 10;
        }

        return (x == revHalf) || (x == revHalf / 10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(9879789));
    }
}
