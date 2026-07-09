// Last updated: 7/9/2026, 3:13:30 PM
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<String> q = new LinkedList<>();
        if(!set.contains(endWord)) return 0;
        q.offer(beginWord);
        int a = 1;
        while(!q.isEmpty()) {
            for(int s = q.size(); s > 0; s--) {
                String word = q.poll();
                if(word.equals(endWord)) return a;
                char[] arr = word.toCharArray();
                for(int i = 0; i < arr.length; i++) {
                    char old = arr[i];
                    for(char c = 'a'; c <= 'z'; c++) {
                        arr[i] = c;
                        String next = new String(arr);
                        if(set.remove(next))
                            q.offer(next);
                    }
                    arr[i] = old;
                }
            }
            a++;
        }
        return 0;
    }
}