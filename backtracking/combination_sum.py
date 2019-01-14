class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """

        def helper(candidates, target, temp, res, index):
            # target (target - candidates[i]) is equal to 0,
            # return list of result
            if target == 0:
                res.append(temp)
                return
            for i in xrange(index, len(candidates)):
                # if target is less than candidates[i],
                # return and back off from current path
                if target < candidates[i]:
                    return
                # if target is greater than candidates[i],
                # substract candidates[i] from target
                # add candidates[i] into result list
                # move on to next candidates
                helper(candidates, target-candidates[i], temp+[candidates[i]], res, i)

        res = []

        candidates.sort()

        helper(candidates, target, [], res, 0)

        return res
