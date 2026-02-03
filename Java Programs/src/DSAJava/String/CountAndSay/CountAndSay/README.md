# Count and Say (Java)

This project implements the **Count and Say** sequence using three different approaches:
- Brute Force
- Better (StringBuilder Optimization)
- Optimal (Two Pointer Grouping)

The goal is to generate the **nth term** of the Count and Say sequence efficiently while understanding different problem-solving strategies.

---

## 📌 Problem Statement

You are given an integer `n`.  
Generate the **nth term** in the Count and Say sequence.

Each term is constructed by **reading the previous term aloud** and counting consecutive digits.

---

## 🔢 Sequence Example

1 → "1"

2 → "11" (one 1)

3 → "21" (two 1s)

4 → "1211" (one 2, one 1)

5 → "111221" (one 1, one 2, two 1s)


---

## 🛠️ Approaches Implemented

### 1️⃣ Brute Force Approach
- Iteratively builds the sequence
- Uses string concatenation to generate the next term
- Simple but slower due to repeated string operations

**Time Complexity:** O(N × L)  
**Space Complexity:** O(L)

---

### 2️⃣ Better Approach (Using StringBuilder)
- Uses `StringBuilder` instead of direct string concatenation
- More efficient memory and time handling
- Preferred over brute in interviews

**Time Complexity:** O(N × L)  
**Space Complexity:** O(L)

---

### 3️⃣ Optimal Approach (Two Pointer Technique)
- Uses two pointers to count consecutive characters
- Clean logic for grouping digits
- Most readable and scalable approach

**Time Complexity:** O(N × L)  
**Space Complexity:** O(L)

> `N` = term number  
> `L` = length of generated string

---

## 🚀 How to Run

### Compile
```bash
javac CountAndSay.java

java CountAndSay
```

📂 Project Structure

CountAndSay.java

README.md

✍️ Author

Siddharth Pandey

Java + DSA Learner | Interview Preparation