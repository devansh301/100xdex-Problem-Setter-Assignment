### Test Case 1

**Input:**

```cpp
s = "aabbccc"
N = 3
```

**Expected Output:**

```cpp
6 // Subsequence "aabbcc" is 3-good: 'a' appears 2 times, 'b' appears 2 times, 'c' appears 3 times
```

### Test Case 2

**Input:**

```cpp
s = "aabbbbccddddeeeff"
N = 4
```

**Expected Output:**

```cpp
10 // Subsequence "aabbbbccdd" is 4-good: 'a' appears 2 times, 'b' appears 4 times, 'c' appears 2 times, 'd' appears 4 times
```

### Test Case 3

**Input:**

```cpp
s = "abcde"
N = 1
```

**Expected Output:**

```cpp
5 // Any single character can form a 1-good subsequence
```

### Test Case 4

**Input:**

```cpp
s = "aaabbbbcc"
N = 2
```

**Expected Output:**

```cpp
3 // Subsequence "aabbc" is 2-good: 'a' appears 1 time, 'b' appears 2 times, 'c' appears 1 time
```

### Test Case 5

**Input:**

```cpp
s = "abcdefghijklmnopqrstuvwxyz"
N = 1
```

**Expected Output:**

```cpp
26 // The whole string is 1-good since all characters appear exactly once
```

### Test Case 6

**Input:**

```cpp
s = "aaaaabbbbbcccccdddddeeeee"
N = 5
```

**Expected Output:**

```cpp
25 // Subsequence "aaaaabbbbbcccccdddddeeeee" is 5-good: 'a', 'b', 'c', 'd', 'e' each appears 5 times
```

### Test Case 7

**Input:**

```cpp
s = "abcabcabcabc"
N = 4
```

**Expected Output:**

```cpp
0 // No valid subsequence can be formed since no character appears exactly 4 times
```

### Test Case 8

**Input:**

```cpp
s = "aaaabbbbccccddddeeee"
N = 4
```

**Expected Output:**

```cpp
20 // Subsequence "aaaabbbbccccddddeeee" is 4-good: 'a', 'b', 'c', 'd', 'e' each appears 4 times
```

### Test Case 9

**Input:**

```cpp
s = "aaaaaaabbbbbbbbbcccccc"
N = 5
```

**Expected Output:**

```cpp
0 // No valid subsequence can be formed since no character appears exactly 5 times
```

### Test Case 10

**Input:**

```cpp
s = "aabbccddeeffgg"
N = 2
```

**Expected Output:**

```cpp
6 // Subsequence "aabbcc" is 2-good: 'a', 'b', 'c' each appears 2 times
```
