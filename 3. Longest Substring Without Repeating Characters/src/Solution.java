import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        char curChar;
        for (int end = 0; end < s.length(); end++) {
            curChar = s.charAt(end);
            if (set.contains(curChar)) {
                set.remove(s.charAt(start));
                start++;
                end--;
            } else {
                set.add(curChar);
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }
        return maxLength;
    }
}