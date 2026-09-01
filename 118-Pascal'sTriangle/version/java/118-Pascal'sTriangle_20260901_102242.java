// Last updated: 9/1/2026, 10:22:42 AM
1class Solution {
2  public List<List<Integer>> generate(int numRows) {
3    List<List<Integer>> ans = new ArrayList<>();
4    for (int i = 0; i < numRows; ++i) {
5      Integer[] temp = new Integer[i + 1];
6      Arrays.fill(temp, 1);
7      ans.add(Arrays.asList(temp));
8    }
9    for (int i = 2; i < numRows; ++i)
10      for (int j = 1; j < ans.get(i).size() - 1; ++j)
11        ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
12    return ans;
13  }
14}