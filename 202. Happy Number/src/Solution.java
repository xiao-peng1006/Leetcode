import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (n != 1) {
            n = helper(n);
            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
        }
        return true;
    }

    public int helper(int n) {
        int sum = 0, d = 0;
        while (n != 0) {
            d = n % 10;
            sum += d * d;
            n = n / 10;
        }
        return sum;
    }
}