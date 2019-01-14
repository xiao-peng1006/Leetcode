class Solution(object):
    def grayCode(self, n):
        """
        :type n: int
        :rtype: List[int]
        """

        res = []

        # x<<y, x with the bits shifted to the left by y places
        # in here, equals to 1*(2**n)
        size = 1<<n

        for i in range(size):
            # x>>y, x with the bits shifted to the right by y places.
            res.append((i>>1)^i)
        return res
