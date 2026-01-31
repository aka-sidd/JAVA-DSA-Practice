# Check Palindrome in Java (Brute, Better, Optimal)

This program checks whether a given string is a palindrome using three different approaches:
Brute Force, Better (StringBuilder), and Optimal (Two Pointer).  
The goal is to understand how performance and space usage improve with each optimization.

---

## 📌 Problem Statement

Given a string `s`, determine if it is a palindrome.  
A palindrome is a string that reads the same forward and backward.

### Example
Input:
madam

Output:


---

## 🛠️ Approaches Used

### 1️⃣ Brute Force Approach
- Reverse the string by traversing it from the end.
- Build a new string using string concatenation.
- Compare the reversed string with the original string.

**Time Complexity:** O(n²)  
**Space Complexity:** O(n)

---

### 2️⃣ Better Approach (Using StringBuilder)
- Use `StringBuilder` to efficiently build the reversed string.
- Convert it to a string using `toString()`.
- Compare with the original string.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### 3️⃣ Optimal Approach (Two Pointer Technique)
- Use two pointers: one from the start (`left`) and one from the end (`right`).
- Compare characters while moving towards the center.
- If any characters mismatch, return `false`.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## ▶️ How to Run

1. Open the project in IntelliJ or any Java IDE
2. Navigate to:
   CheckPalindrome.java

3. Run the `main()` method

---

## 📂 File Structure
CheckPalindrome/
├── CheckPalindrome.java
└── README.md

---

## 🎯 Learning Outcome

- Understanding brute force vs optimized solutions
- Time and space complexity comparison
- Efficient use of `StringBuilder`
- Applying the two-pointer technique on strings

---

## ✍️ Author

**Siddharth Pandey**  
Java + DSA Learner | Aspiring Software Developer 🚀
