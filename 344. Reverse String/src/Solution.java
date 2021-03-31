class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int i = 0;
        while (i < len/2) {
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
            i++;
        }
    }
}