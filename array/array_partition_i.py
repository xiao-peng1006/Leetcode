class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0;
        nums = sorted(nums);
        i = 0;

        while i < len(nums):
            res += nums[i];
            i += 2;
        return res
