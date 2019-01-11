class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        # define recursion function
        def helper(l, r, temp, res):

            if l > r:
                return
            # When both counter gets to 0, add string to result list
            if l == 0 and r == 0:
                res.append(temp)
            if l > 0:
                helper(l-1, r, temp+'(', res)
            if r > 0:
                helper(l, r-1, temp+')', res)

        res = []

        helper(n, n, '', res)

        return res
