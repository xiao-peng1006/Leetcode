import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        /*
        Assign two matching characters with the same number
        */

        if (s.length() != t.length()) {
            return false;
        }

        int[] sArray = new int[256];
        int[] tArray = new int[256];
        char sChar, tChar;
        for (int i = 0; i < s.length(); i++) {
            sChar = s.charAt(i);
            tChar = t.charAt(i);
            if (sArray[sChar] != tArray[tChar]) {
                return false;
            }
            sArray[sChar] = i + 1;
            tArray[tChar] = i + 1;
        }
        return true;
    }
}