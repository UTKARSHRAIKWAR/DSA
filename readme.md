# DSA Roadmap with Java for Placements

This roadmap is designed for students who have already completed Java fundamentals and are preparing for technical placements in product and service-based companies.

---

## 🚀 Phase 1: Core DSA Concepts (4–6 weeks)

### 📦 Arrays & Strings

- Array basics, prefix sum
- Sliding window technique
- Two pointers, Kadane’s Algorithm
- StringBuilder, pattern matching

**Practice:** 25–30 problems  
**LeetCode Tags:** Arrays, Strings, Two Pointers

### 🔗 Linked List

- Singly/Doubly Linked List
- Reverse LL, Detect loop (Floyd's Algo)
- Merge two sorted LL, K-th node, Palindrome LL

**Practice:** 15–20 problems

### 📚 Stack & Queue

- Infix/Prefix/Postfix conversions
- Min stack, Next Greater Element
- Queue using stack, Circular Queue
- Deque, LRU Cache (LinkedHashMap or Deque)

**Practice:** 20 problems

---

## 🌳 Phase 2: Trees and Recursion (3–4 weeks)

### 🌿 Binary Trees & BST

- Inorder, Preorder, Postorder
- Level order, Height, Diameter
- Balanced BST, Invert Binary Tree
- Lowest Common Ancestor (LCA)

### 🧠 Recursion & Backtracking

- Subsets, Permutations
- N-Queens, Rat in Maze
- Sudoku Solver

**Practice:** 30–40 problems total

---

## 📈 Phase 3: Advanced DSA Topics (5–6 weeks)

### 🗺️ Searching & Sorting

- Binary search on answers (search space)
- QuickSort, MergeSort, CountSort
- Kth smallest/largest, Sorting comparator

### 🧮 Hashing & Heaps

- HashMap, HashSet, Frequency map
- PriorityQueue (min/max heaps)
- Top K Frequent, Sort by Frequency

### 🔢 Bit Manipulation

- XOR problems, Bit masking
- Power of 2, Set/Unset bits

### 📊 Sliding Window & Two Pointers

- Max sum subarray of size K
- Longest substring without repeating chars
- Container with most water

### 📐 Dynamic Programming (DP)

- 0/1 Knapsack, Subset sum
- Longest Increasing Subsequence (LIS)
- Longest Common Subsequence (LCS)
- DP on grids (m\*n)
- Tabulation vs Memoization

---

## 🌐 Phase 4: Graphs (2–3 weeks)

- BFS, DFS (Matrix + Adjacency List)
- Topological Sort (Kahn’s Algo, DFS)
- Dijkstra’s Algorithm (PriorityQueue)
- Union Find (Disjoint Set), Kruskal’s Algo
- Cycle detection (Directed/Undirected)

---

## 🎯 Phase 5: Final Prep + Mock (Ongoing)

### 📌 Practice Patterns:

- LeetCode 75
- Blind 75
- Striver’s A2Z DSA Sheet
- Love Babbar 450

### 📌 Weekly Schedule (Sample):

| Day | Focus                            |
| --- | -------------------------------- |
| Mon | Learn new concept + 3-5 problems |
| Tue | Practice more problems           |
| Wed | Revise + solve old problems      |
| Thu | Learn another topic              |
| Fri | Contest or mock interview        |
| Sat | Resume & Notes revision          |
| Sun | Rest or catch-up day             |

---

## 🛠️ Tools & Platforms

- **LeetCode**: For daily problem solving
- **GeeksforGeeks**: For learning + practice
- **Codeforces / CodeChef**: For contests
- **InterviewBit / Pramp**: For interview prep

---

Happy Coding! 💻🔥

> Want a Notion board or printable PDF version? Let me know!

# 📘 Data Structures & Algorithms (DSA) Short Notes – Java Edition

Quick revision guide for placements, coding interviews, and competitive programming.

---

## ✅ 1. Arrays

- Fixed-size, contiguous memory
- Sorting:
  - Bubble, Selection, Insertion – O(n²)
  - Merge, Quick – O(n log n)
- Patterns: Two pointers, Sliding window, Prefix sum

```java
int[] arr = new int[n];
Arrays.sort(arr);
```

---

## ✅ 2. Strings

- Immutable in Java
- Use `StringBuilder` for efficient manipulation
- Problems: Palindrome, Anagram, Substrings

```java
StringBuilder sb = new StringBuilder(str);
sb.reverse();
```

---

## ✅ 3. Linked List

- Singly: `data`, `next`
- Doubly: `prev`, `data`, `next`
- Techniques: Reverse, Detect loop, Middle node

```java
class Node {
  int data;
  Node next;
  Node(int data) { this.data = data; }
}
```

---

## ✅ 4. Stack

- LIFO (Last In, First Out)
- Use: Expression evaluation, Undo, Valid Parentheses

```java
Stack<Integer> stack = new Stack<>();
```

---

## ✅ 5. Queue

- FIFO (First In, First Out)
- Use: Scheduling, BFS

```java
Queue<Integer> q = new LinkedList<>();
```

---

## ✅ 6. Trees & BST

- Binary Tree: ≤2 children
- BST: Left < Root < Right
- Traversals: Inorder, Preorder, Postorder, Level Order

```java
class TreeNode {
  int val;
  TreeNode left, right;
  TreeNode(int x) { val = x; }
}
```

---

## ✅ 7. Heaps

- Complete Binary Tree
- Min-Heap: Parent ≤ Children
- Max-Heap: Parent ≥ Children

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
```

---

## ✅ 8. Hashing

- Key-value mapping
- Average O(1) search time

```java
HashMap<String, Integer> map = new HashMap<>();
map.put("a", 1); map.get("a");
```

---

## ✅ 9. Recursion

- Function calls itself
- Must have a base case

> Problems: Fibonacci, Subsets, Permutations

---

## ✅ 10. Backtracking

- Try all possibilities, then undo
- Use: Sudoku, N-Queens, Word Search

---

## ✅ 11. Dynamic Programming (DP)

- Break down problems into subproblems
- Memoization (Top-down) & Tabulation (Bottom-up)

> Problems: Knapsack, LCS, LIS

---

## ✅ 12. Greedy

- Local optimum = Global optimum
- Use: Activity Selection, Fractional Knapsack

---

## ✅ 13. Graphs

- Represented as Adjacency List/Matrix
- Traversals:
  - BFS (Queue)
  - DFS (Stack/Recursion)
- Algorithms:
  - Dijkstra (Shortest Path)
  - Kruskal / Prim (MST)
  - Union-Find (Disjoint Set)

```java
ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
```

---

## ✅ 14. Bit Manipulation

- Use bits for optimization
- Ops: &, |, ^, <<, >>

> Use: Check even/odd, Set/Unset bit, Count 1s

---

## ✅ 15. Trie (Prefix Tree)

- Fast prefix search
- Used in dictionary, autocomplete

---

## ✅ Placement Tips

- Focus on Arrays, Strings, DP, Graphs, Trees, Hashing
- Practice 100+ problems
- Follow Striver A2Z / Babbar 450 Sheet
- Do mock contests and time-based tests

---

> ✨ Happy Coding & All the Best for Placements! 🚀
