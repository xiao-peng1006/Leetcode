class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        # Define helper function
        def helper(res, nums, temp):
            # If temp is the same length as nums, return value and append to res
            if (not nums):
                res.append(temp+[])
                return

            for i, num in enumerate(nums):
                temp.append(num)
                # Recursion on rest of the numbers
                helper(res, nums[:i] + nums[i+1:], temp)
                # Reset temp for next list
                temp.pop()

        res = []

        helper(res, nums, [])

        return res
