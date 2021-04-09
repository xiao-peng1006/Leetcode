import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) ->
            map.get(b) - map.get(a)
        );
        pq.addAll(map.keySet());

        while (!pq.isEmpty()) {
            char c = pq.poll();
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}