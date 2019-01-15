class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        count = 0;
        for num in nums:
            if num != 0:
                count += 1;
            else:
                res = max(res, count);
                count = 0;
        return max(res, count)
