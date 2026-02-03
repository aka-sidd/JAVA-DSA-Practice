# Minimum Add to Make Parentheses Valid (Java)

This project solves the problem **"Minimum Add to Make Parentheses Valid"** using three different approaches:
- Brute Force
- Better
- Optimal

The goal is to find the minimum number of parentheses that must be added to make a given string of parentheses valid.

---

## 📌 Problem Statement

You are given a string `s` consisting only of `'('` and `')'`.

A string is **valid** if:
- Every opening bracket `'('` has a corresponding closing bracket `')'`
- Brackets are closed in the correct order

Return the **minimum number of parentheses** you need to add to make the string valid.

---

## 🧪 Examples

### Example 1
Input: "())"
Output: 1
Explanation: Add one '(' to make it "()()"


### Example 2


Input: "((("
Output: 3
Explanation: Add three ')' to make it "((()))"


---

## 🛠️ Approaches Implemented

### 1️⃣ Brute Force (Using Stack)
- Uses a stack to match opening and closing brackets
- Unmatched brackets remain in the stack
- Stack size at the end = answer

**Time Complexity:** O(N)  
**Space Complexity:** O(N)

---

### 2️⃣ Better Approach (Using Counters)
- Keeps track of:
    - `open` → unmatched `'('`
    - `close` → unmatched `')'`
- If a closing bracket appears without an open one, it must be added

**Time Complexity:** O(N)  
**Space Complexity:** O(1)

---

### 3️⃣ Optimal Approach (Balance Method)
- Uses:
    - `balance` → open brackets waiting to be closed
    - `add` → number of brackets to be added
- If `')'` appears when balance is 0, we need to add `'('`

**Time Complexity:** O(N)  
**Space Complexity:** O(1)

---

## 🚀 How to Run

### Compile
```bash
javac MinAddToMakeParenthesesValid.java

Run
java MinAddToMakeParenthesesValid

📂 File Structure
MinAddToMakeParenthesesValid.java
README.md

🎯 Interview Tip

The optimal approach is preferred in interviews because it solves the problem in O(N) time and O(1) space using a simple balance counter.

✍️ Author

Siddharth Pandey
Java + DSA Learner | Interview Preparation