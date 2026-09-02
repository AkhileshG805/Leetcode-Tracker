// Last updated: 9/2/2026, 8:36:07 PM
1class Solution {
2    private void reverse(
3        char[] characters,
4        int leftIndex,
5        int rightIndex
6    ) {
7        while (leftIndex < rightIndex) {
8            char temporaryCharacter = characters[leftIndex];
9            characters[leftIndex] = characters[rightIndex];
10            characters[rightIndex] = temporaryCharacter;
11            leftIndex++;
12            rightIndex--;
13        }
14    }
15    public String reverseStr(String s, int k) {
16        char[] characters = s.toCharArray();
17        int stringLength = characters.length;
18        int blockStartIndex = 0;
19        while (blockStartIndex < stringLength) {
20            int reverseEndIndex = Math.min(
21                blockStartIndex + k - 1,
22                stringLength - 1
23            );
24            reverse(
25                characters,
26                blockStartIndex,
27                reverseEndIndex
28            );
29            blockStartIndex += 2 * k;
30        }
31        return new String(characters);
32    }
33}