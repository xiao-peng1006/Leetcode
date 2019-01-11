class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """

        x = int(str(x)[::-1]) if x >= 0 else -int(str(-x)[::-1])
        # need to take care of the size of integer
        # to prevent overflow
        return 0 if x > 2**31 or x < -2**31 else x
