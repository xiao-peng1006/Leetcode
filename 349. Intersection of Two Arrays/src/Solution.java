import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1set = new HashSet<>();
        for (int num : nums1) {
            nums1set.add(num);
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums2) {
            if (nums1set.contains(num)) {
                set.add(num);
            }
        }

        int[] res = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            res[idx++] = num;
        }
        return res;
    }
}