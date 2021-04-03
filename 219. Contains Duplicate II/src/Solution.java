import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Maintaining a Hashset with only elements within a distance of k
        HashSet<Integer> set = new HashSet<>();
        int left = 0, right = k, idx = k;
        for (int i = 0; i < right && i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        while (idx < nums.length) {
            if (set.contains(nums[idx])) {
                return true;
            }
            set.add(nums[idx++]);
            set.remove(nums[left++]);
        }

        return false;
    }
}