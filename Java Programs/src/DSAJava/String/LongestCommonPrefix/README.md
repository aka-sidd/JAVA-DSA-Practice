# Longest Common Prefix (Java)

This project solves the **Longest Common Prefix** problem using three different approaches:  
**Brute Force, Better, and Optimal**.  
The goal is to find the longest prefix that is common to all strings in the given array.

---

## 🧠 Problem Statement

You are given an array of strings.  
Your task is to return the **longest common prefix** shared by all the strings.  
If there is no common prefix, return an empty string.

---

## ✨ Examples

### Example 1
**Input:**
["flower", "flow", "flight"]

**Output:**


fl


### Example 2
**Input:**


["dog", "racecar", "car"]

**Output:**


EMPTY

(No common prefix exists)

---

## 📂 Project Structure



LongestCommonPrefix.java


This file contains:
- Brute force solution
- Better solution using character comparison
- Optimal solution using sorting

---

## 🚀 Approaches Explained

### 1. Brute Force
- Assumes the first string as the prefix.
- Reduces the prefix until all strings start with it.

**Time Complexity:** O(n × m²)  
**Space Complexity:** O(1)

---

### 2. Better
- Finds the smallest string in the array.
- Compares each character of it with the same index in all strings.

**Time Complexity:** O(n × m)  
**Space Complexity:** O(1)

---

### 3. Optimal
- Sorts the array of strings.
- Compares only the first and last strings to find the common prefix.

**Time Complexity:** O(n log n × m)  
**Space Complexity:** O(1)

Where:
- `n` = number of strings
- `m` = length of the smallest string

---

## ▶️ How to Run

1. Compile the code:
   ```bash
   javac LongestCommonPrefix.java


Run the program:

java LongestCommonPrefix

🎯 Key Learning

1> Understanding prefix-based string problems

2> Using different strategies to optimize performance

3> Handling edge cases like empty results

4> Writing clean and readable Java code

📌 Author

Siddharth Pandey
(Java & DSA Practice)