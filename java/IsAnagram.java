public class IsAnagram {

    // solution1

    /**
     * tc: O(N)
     * sc: O(1)
     */
    static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c: count){
            if(c != 0) return false;
        }

        return true;
    }
// solution2
    /**
     * tc: O(N)
     * sc: O(N)
     */
//    static boolean isAnagram(String s, String t) {
//        Map<Character, Integer> count = new HashMap<>();
//
//        for (char ch : s.toCharArray()) {
//            count.put(ch, count.getOrDefault(ch, 0) + 1);
//        }
//        for (char ch : t.toCharArray()) {
//            count.put(ch, count.getOrDefault(ch, 0) - 1);
//        }
//        for (int val : count.values()) {
//            if (val != 0) return false;
//        }
//
//        return true;
//    }

    // solution3
    /**
     * tc: O(N)
     * sc: O(1)
     */
//    class Solution {
//        public boolean isAnagram(String s, String t) {
//            if(s.length() != t.length()) {
//                return false;
//            }
//            int[] cnt1 = new int[26];
//            int[] cnt2 = new int[26];
//            for(int i=0;i<s.length();i++) {
//                cnt1[s.charAt(i)-'a']++;
//            }
//            for(int i=0;i<t.length();i++) {
//                cnt2[t.charAt(i)-'a']++;
//            }
//
//            for(int i=0;i<26;i++) {
//                if (cnt1[i] != cnt2[i]) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }

    /**
     *
     * | Input type                               | Best array size             | Why                                           |
     * | ---------------------------------------- | --------------------------- | --------------------------------------------- |
     * | Only lowercase English letters           | int[26]                     | Exactly matches 'a'–'z' linkedin+1            |
     * | ASCII (standard)                         | int[128]                    | Covers 0–127 linkedin                         |
     * | Extended ASCII                           | int[256]                    | Covers 0–255 linkedin+1                       |
     * | Full Unicode (any language, emoji, etc.) | HashMap<Character, Integer> | Unicode has >1M code points, not 256 reddit+1 |
     *
     */

    public static void main(String[] args){
        String s1 = "anagram";
        String s2 = "nafaram";
        System.out.println(isAnagram(s1, s2));
    }
}
