class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """

        # define the combinations of a phone keyboard
        dict = {'2': ['a', 'b', 'c'],
                '3': ['d', 'e', 'f'],
                '4': ['g', 'h', 'i'],
                '5': ['j', 'k', 'l'],
                '6': ['m', 'n', 'o'],
                '7': ['p', 'q', 'r', 's'],
                '8': ['t', 'u', 'v'],
                '9': ['w', 'x', 'y', 'z']}

        def helper(num, temp, res):
            # corner case
            if len(digits) == 0:
                return
            # if num is equal to length of digits,
            # which means the recursion has successfully ran to end
            # append current result string into result list
            if num == len(digits):
                res.append(temp)
                return

            # for each letter in the match dictionary
            # run helper function with next number
            for letter in dict[digits[num]]:
                helper(num+1, temp+letter, res)

        res = []

        helper(0, '', res)

        return res
