// Last updated: 9/1/2026, 11:01:40 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] words=s.split("\\s+");
4        if(pattern.length()!=words.length){
5            return false;
6        }
7        HashMap<Character, String> map1 = new HashMap<>();
8        HashMap<String, Character> map2 = new HashMap<>();
9        for(int i=0;i<pattern.length();i++){
10            char c=pattern.charAt(i);
11            String w = words[i];
12        if(map1.containsKey(c) && !map1.get(c).equals(w)){
13            return false;
14        }
15        if(map2.containsKey(w) && map2.get(w)!=c){
16            return false;
17        }
18        map1.put(c, w);
19        map2.put(w, c);
20        }
21        return true;
22    }
23}