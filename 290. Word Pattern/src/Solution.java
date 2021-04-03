import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");
        if (pattern.length() != sArray.length) {
            return false;
        }


        HashMap<Character, String> map = new HashMap<>();
        int idx = 0;
        char c;
        while (idx < pattern.length()) {
            c = pattern.charAt(idx);
            if (!map.containsKey(c) && !map.containsValue(sArray[idx])) {
                map.put(c, sArray[idx]);
            }

            if ((!map.containsKey(c) && map.containsValue(sArray[idx])) || !(map.get(c).equals(sArray[idx]))) {
                return false;
            }
                idx++;
            }
        return true;
    }
}