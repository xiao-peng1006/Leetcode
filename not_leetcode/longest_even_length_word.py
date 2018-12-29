import sys
sys.stdout.flush()

def solution(sentence):
    """
    string: sentence
    """

    temp = ''

    if sentence is None:
        return '00'

    for word in sentence.split():
        if len(word) % 2 == 0 and len(word) > len(temp):
            temp = word

    return '00' if len(temp) == 0 else temp

# Test cases
string1 = 'Time to write great code'
string1result = 'Time'

string2 = 'I am in my car'
string2result = 'am'

string3 = None
string3result = '00'

string4 = 'I ate nothing'
string4result = '00'

print('output: ' + solution(string1))
print('expect: ' + string1result)
print('')

print('output: ' + solution(string2))
print('expect: ' + string2result)
print('')

print('output: ' + solution(string3))
print('expect: ' + string3result)
print('')

print('output: ' + solution(string4))
print('expect: ' + string4result)
print('')

# Time complexity: O(n), Space complexity: O(n)
