import java.util.HashSet;

class Solution {
    char[] charArray;
    public String reverseVowels(String s) {
        charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            while (left < charArray.length && !isVowel(charArray[left])) {
                left++;
            }

            while (right >= 0 && !isVowel(charArray[right])) {
                right--;
            }
            if (left > right) continue;
            swap(left++, right--);
        }
        return new String(charArray);
    }

    public void swap(int a, int b) {
        char c = charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = c;
    }

    public boolean isVowel(Character c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }
}