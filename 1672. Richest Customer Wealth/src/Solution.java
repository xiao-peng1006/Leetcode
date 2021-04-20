import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int n : account) {
                sum += n;
            }
            if (sum > res) {
                res = sum;
            }
        }
        return res;
    }
}