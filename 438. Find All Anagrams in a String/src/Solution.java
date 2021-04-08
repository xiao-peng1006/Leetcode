import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        if (s.length() < p.length()) {
            return res;
        }

        int start = 0, end = p.length();

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> pCount = new HashMap<>();
        for (char c:p.toCharArray()) {
            pCount.put(c, pCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sCount.put(c, sCount.getOrDefault(c, 0) + 1);

            if (i >= p.length()) {
                c = s.charAt(i - p.length());
                if (sCount.get(c) == 1) {
                    sCount.remove(c);
                } else {
                    sCount.put(c, sCount.get(c) - 1);
                }
            }

            if (sCount.equals(pCount)) {
                res.add(i - p.length() + 1);
            }


        }
        return res;
    }
}