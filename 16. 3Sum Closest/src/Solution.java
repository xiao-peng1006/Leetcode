import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < minDiff) {
                    minDiff = Math.abs(target - sum);
                    res = sum;
                }

                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }
}