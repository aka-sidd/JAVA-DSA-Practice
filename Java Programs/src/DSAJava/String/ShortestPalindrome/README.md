# Shortest Palindrome (LeetCode 214)

This project provides an **optimized KMP (Knuth-Morris-Pratt)** based solution to solve the **Shortest Palindrome** problem.

The goal is to create the shortest possible palindrome by **adding characters only at the front of the string**.

---

## 🧠 Problem Statement

Given a string `s`, return the **shortest palindrome** you can form by adding characters in front of it.

---

## 📌 Examples

### Example 1:
Input: "aacecaaa"

Output: "aaacecaaa"


### Example 2:
Input: "abcd"

Output: "dcbabcd"


### Example 3:

Input: "race"

Output: "ecarace"



---

## ⚙️ Approach — KMP Algorithm

### Key Insight:
We need to find the **longest prefix of the string that is already a palindrome**.  
Once found, we reverse the remaining suffix and add it to the front.

---

## 🧩 KMP Trick
1. Reverse the string:

Combine

2. rev = reverse(s)
---
temp = s + "#" + rev

3. Build the **LPS array** for `temp`.
4. The **last value of the LPS array** gives the length of the longest palindromic prefix.
5. Reverse the remaining suffix and prepend it to `s`.

---

## 🚀 Why This Works

The LPS array finds the **longest prefix of `s` that matches a suffix of `reverse(s)`**, which directly corresponds to a **palindromic prefix**.

---

## 🛠️ Code Structure

- `shortestPalindrome(String s)`  
  Main logic for building the shortest palindrome.
- `buildLPS(String pat)`  
  Constructs the LPS array using the KMP algorithm.
- `main()`  
  Driver code for local testing.

---

## ⏱️ Time & Space Complexity

| Metric | Value |
|--------|--------|
| Time Complexity | **O(n)** |
| Space Complexity | **O(n)** |

---

## 🧠 Learning Outcomes

By solving this problem, you learn:
- How to use **KMP beyond substring search**
- How to detect **palindromic prefixes efficiently**
- How to optimize from **O(n²)** to **O(n)**

---

## 🏆 Interview Tip

> We transform the palindrome problem into a prefix-suffix matching problem using KMP by comparing the string with its reverse.

---

## 🔗 LeetCode Link

- https://leetcode.com/problems/shortest-palindrome/

---

Author ✍️

Siddharth Pandey

Java & DSA Learner

