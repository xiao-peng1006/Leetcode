import java.util.HashMap;

class Solution {
    public int maxPoints(int[][] points) {
        if (points.length < 3) {
            return points.length;
        }

        int res = 0;
        HashMap<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    double slope = slope(points[i], points[j]);
                    map.put(slope, map.getOrDefault(slope, 1) + 1);
                }
            }

            for (int count : map.values()) {
                if (count > res) {
                    res = count;
                }
            }
            map.clear();
        }
        return res;
    }

    public double slope(int[] a, int[] b) {
        return 1.0 * (b[1] - a[1]) / (b[0] - a[0]) + 0.0;
    }
}