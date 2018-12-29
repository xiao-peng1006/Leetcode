import sys
sys.stdout.flush()

def solution(a, b):
    """
    string: a
    string: b
    """

    i = 0
    res = []

    while i < len(a) and i < len(b):
        res.append(a[i])
        res.append(a[i])
        i += 1

    if len(a) > len(b):
        res.append(a[i:])
    else:
        res.append(b[i:])

    return ''.join(res)

# Test cases
a1 = 'abc'
b1 = 'def'
result1 = 'adbecf'
print('output: ' + solution(a1, b1))
print('expect: ' + result1)
print('')

a1 = 'abc'
b1 = 'defgh'
result1 = 'adbecfgh'
print('output: ' + solution(a1, b1))
print('expect: ' + result1)
print('')

a1 = 'abcde'
b1 = 'fgh'
result1 = 'afbgchde'
print('output: ' + solution(a1, b1))
print('expect: ' + result1)
print('')

# Time complexity: O(n), Space complexity: O(n), O(a+b)
