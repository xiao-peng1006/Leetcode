import java.util.HashMap;

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        if (points.length < 3) {
            return 0;
        }

        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    int dist = dist(points[i], points[j]);
                    map.put(dist, map.getOrDefault(dist, 0) + 1);
                }
            }

            for (int count : map.values()) {
                res += count * (count - 1);
            }
            map.clear();
        }
        return res;
    }

    public int dist(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }
}