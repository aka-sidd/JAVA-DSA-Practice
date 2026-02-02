# Largest Odd Number in String (Java)

This project solves the **Largest Odd Number in String** problem using three different approaches:  
**Brute Force, Better, and Optimal**.  
The goal is to find the largest odd-numbered substring that is a **prefix** of the given numeric string.

---

## 🧠 Problem Statement

You are given a string `num` that contains only digits.  
Your task is to return the **largest odd-numbered substring** of `num` that starts from index `0` (prefix).  
If no such substring exists, return an empty string.

---

## ✨ Examples

### Example 1
**Input:**
35427

**Output:**


35427


### Example 2
**Input:**


4206

**Output:**


EMPTY

(No odd digit exists in the string, so the result is an empty string)

---

## 📂 Project Structure



LargestOddNumberInString.java


This file contains:
- Brute force solution
- Better solution using right-to-left scan
- Optimal solution (clean and efficient)

---

## 🚀 Approaches Explained

### 1. Brute Force
- Checks all prefixes from longest to shortest.
- For each prefix, checks if the last digit is odd.
- Returns the first valid odd prefix found.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

### 2. Better
- Traverses the string from right to left.
- Finds the first odd digit.
- Returns the substring from start to that index.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### 3. Optimal
- Same logic as the better approach.
- Written in a cleaner and more readable way.
- Uses minimal variables and simple checks.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## ▶️ How to Run

1. Compile the program:
   ```bash
   javac LargestOddNumberInString.java


Run the program:

java LargestOddNumberInString

🎯 Key Learning

1> Understanding prefix-based problems

2> Using right-to-left traversal for optimization

3> Checking odd/even digits efficiently

4> Writing clean and readable Java code

📌 Author

Siddharth Pandey
(Java & DSA Practice)