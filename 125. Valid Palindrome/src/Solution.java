class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        char leftChar, rightChar;
        while (left < right) {
            leftChar = s.charAt(left);
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }
            left++; right--;
        }
        return true;
    }
}