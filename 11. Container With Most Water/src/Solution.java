class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int curWater = getWater(height, left, right);
            maxWater = curWater > maxWater ? curWater : maxWater;

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxWater;
    }

    public int getWater(int[] height, int left, int right) {
        return Math.min(height[left], height[right]) * (right - left);
    }
}