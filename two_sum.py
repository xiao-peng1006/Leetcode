class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        # create dictionary
        # key = number, value = index
        keys = {}
        for i in xrange(len(nums)):
            # if the result exists in the dictionary, return both indexes
            if target-nums[i] in keys:
                return [keys[target-nums[i]], i]
            # store number and index into dictionary
            if target-nums[i] not in keys:
                keys[nums[i]] = i
