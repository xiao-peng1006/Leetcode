import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        /*
        Arrays.sort(nums);
         */

        int zero = -1, two = nums.length;
        for (int i = 0; i < two;) {
            if (nums[i] == 0) {
                swap(nums, ++zero, i++);
            } else if (nums[i] == 2) {
                swap(nums, i, --two);
            } else {
                i++;
            }
        }
    }

    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}