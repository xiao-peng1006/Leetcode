class Solution(object):
    def letterCasePermutation(self, S):
        """
        :type S: str
        :rtype: List[str]
        """

        ans = [[]]

        for char in S:
            n = len(ans)
            # check if it is a letter
            if char.isalpha():
                # if it is letter, append both upper and lower case into separate array
                for i in xrange(n):
                    ans.append(ans[i][:])
                    ans[i].append(char.lower())
                    ans[n+i].append(char.upper())
            else:
                # if it is number, just append
                for i in xrange(n):
                    ans[i].append(char)

        # Join all characters into a string for each element in the array
        # and then return
        return map("".join, ans)
