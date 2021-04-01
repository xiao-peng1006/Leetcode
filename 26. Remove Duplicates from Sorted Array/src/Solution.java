class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int nonDuplcateIndex = 1, targetNum = nums[0], idx = 1;
        while (idx < nums.length) {
            if (nums[idx] != targetNum) {
                nums[nonDuplcateIndex++] = nums[idx];
                targetNum = nums[idx];
            }
            idx++;
        }
        return nonDuplcateIndex;
    }
}