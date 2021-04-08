import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> tCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        int minLength = s.length();
        String res = "";
        int start = 0, end  = 0;
        int required = tCount.size(), formed = 0;
        HashMap<Character, Integer> sCount = new HashMap<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            sCount.put(c, sCount.getOrDefault(c, 0) + 1);
            if (tCount.containsKey(c) && sCount.get(c).intValue() == tCount.get(c).intValue()) {
                formed++;
            }

            while (start <= end && formed == required) {
                c = s.charAt(start);
                if (end - start< minLength) {
                    minLength = end - start;
                    res = s.substring(start, end + 1);
                }

                if (tCount.containsKey(c) && sCount.get(c).intValue() == tCount.get(c).intValue()) {
                    formed--;
                }

                if (sCount.get(c) == 1) {
                    sCount.remove(c);
                } else {
                    sCount.put(c, sCount.get(c) - 1);
                }

                start++;
            }
            end++;
        }
        return res;
    }
}
