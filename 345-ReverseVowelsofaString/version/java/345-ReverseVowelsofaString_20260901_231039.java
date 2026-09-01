// Last updated: 9/1/2026, 11:10:39 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        ArrayList<Integer> l1 = new ArrayList<>();
4        HashSet<Integer> s1 = new HashSet<>();
5        for (int no : nums1) {
6            s1.add(no);
7        }
8        for (int no : nums2) {
9            if (s1.contains(no)) {
10                s1.remove(no);
11                l1.add(no);
12            }
13        }
14        int[] arr = new int[l1.size()];
15        int i = 0;
16        for (int num : l1) {
17            arr[i++] = num;
18        }
19        return arr;
20    }
21}