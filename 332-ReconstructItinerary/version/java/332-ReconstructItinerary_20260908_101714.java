// Last updated: 9/8/2026, 10:17:14 AM
1import java.util.*;
2class RandomizedCollection {
3
4    private List<Integer> list;
5    private Map<Integer, Set<Integer>> map;
6    private Random random;
7
8    public RandomizedCollection() {
9        list = new ArrayList<>();
10        map = new HashMap<>();
11        random = new Random();
12    }
13    
14    public boolean insert(int val) {
15        boolean notPresent = !map.containsKey(val);
16
17        map.computeIfAbsent(val, k -> new HashSet<>()).add(list.size());
18        list.add(val);
19
20        return notPresent;
21    }
22    
23    public boolean remove(int val) {
24        if (!map.containsKey(val)) return false;
25
26        // Get an index of the value to remove
27        int removeIndex = map.get(val).iterator().next();
28
29        int lastIndex = list.size() - 1;
30        int lastElement = list.get(lastIndex);
31
32        // Move last element to the removed index
33        list.set(removeIndex, lastElement);
34
35        // Update index sets
36        map.get(val).remove(removeIndex);
37        map.get(lastElement).add(removeIndex);
38        map.get(lastElement).remove(lastIndex);
39
40        // Remove last element
41        list.remove(lastIndex);
42
43        // Clean up map if no more occurrences
44        if (map.get(val).isEmpty()) {
45            map.remove(val);
46        }
47
48        return true;
49    }
50    
51    public int getRandom() {
52        return list.get(random.nextInt(list.size()));
53    }
54}
55