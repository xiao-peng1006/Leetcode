class Solution {
    public int removeElement(int[] nums, int val) {
        int nonRemovalIndex = 0, idx = 0;
        while (idx < nums.length) {
            if (nums[idx] != val) {
                nums[nonRemovalIndex++] = nums[idx];
            }
            idx++;
        }

        int res = nonRemovalIndex;

        /*
        Elements beyond length does not matter, so code below is optional.
         */
        while (nonRemovalIndex < nums.length) {
            nums[nonRemovalIndex++] = 0;
        }
        return res;
    }
}