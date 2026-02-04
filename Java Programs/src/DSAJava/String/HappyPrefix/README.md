# Longest Happy Prefix (LeetCode 1392)

This project implements an efficient **KMP (Knuth-Morris-Pratt)** based solution to solve the **Longest Happy Prefix** problem from LeetCode.

A **happy prefix** is defined as a prefix of a string which is also a suffix, but not the entire string itself.

---

## 🧠 Problem Statement

Given a string `s`, find the **longest happy prefix**.

### Rules:
- The prefix must be **non-empty**
- The prefix must also appear as a **suffix**
- The prefix **cannot be the entire string**

---

## 📌 Examples

### Example 1:
Input: "ababab"

Output: "abab"


### Example 2:

Input: "leetcode"

Output: empty


### Example 3:

Input: "level"

Output: "l"


---

## ⚙️ Approach — KMP Algorithm

We use the **LPS (Longest Prefix Suffix) array** from the KMP algorithm.

### Key Insight:
- The **last value of the LPS array** gives the length of the longest prefix of the string that is also a suffix.

### Steps:
1. Build the LPS array for the string.
2. Read the last value from the LPS array.
3. Return the substring from index `0` to `lps[n-1]`.

---

## 🧩 Why KMP?

### Brute Force:
- Try all prefix and suffix pairs
- Time Complexity: **O(n²)**

### KMP:
- Precomputes prefix-suffix relationships
- Time Complexity: **O(n)**
- Space Complexity: **O(n)**

---

⏱️ Time & Space Complexity

| Metric           | Value    |
| ---------------- | -------- |
| Time Complexity  | **O(n)** |
| Space Complexity | **O(n)** |

---
🧠 Learning Outcomes

1) By solving this problem, you understand:

2) How the KMP LPS array works internally

3) How to optimize prefix-suffix matching problems

4) How to transform brute force string problems into linear-time solutions

---
🏆 Interview Tip
---
Always mention that the last value of the LPS array directly gives the longest prefix which is also a suffix in O(n) time.

🔗 LeetCode Link:

https://leetcode.com/problems/longest-happy-prefix/