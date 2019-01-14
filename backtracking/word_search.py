class Solution(object):
    def exist(self, board, word):
        """
        :type board: List[List[str]]
        :type word: str
        :rtype: bool
        """
        def helper(board, word, x, y, i):
            if i == len(word):
                return True
            # if index exceeds the size of list, return false
            if x < 0 or x >= len(board[0]) or y < 0 or y >= len(board):
                return False
            if board[y][x] != word[i]:
                return False
            # swap case to mark the path taken
            board[y][x] = board[y][x].swapcase()
            # if match found, move to closest four neighbours
            isExit = helper(board, word, x+1, y, i+1) or helper(board, word, x-1, y, i+1) or helper(board, word, x, y+1, i+1) or helper(board, word, x, y-1, i+1)
            board[y][x] = board[y][x].swapcase()
            return isExit

        # start search location and loop through the list
        for y in xrange(len(board)):
            for x in xrange(len(board[0])):
                if helper(board, word, x, y, 0):
                    return True

        return False
