import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        int idx = 0;
        for (char sChar : s.toCharArray()) {
            if (map.containsKey(sChar)) {
                if (map.get(sChar) != t.charAt(idx)) {
                    return false;
                }
            } else {
                if (map.containsValue(t.charAt(idx))) {
                    return false;
                }
                map.put(sChar, t.charAt(idx));
            }
            idx++;
        }
        return true;


        /*
        Assign two matching characters with the same number

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
         */
    }
}