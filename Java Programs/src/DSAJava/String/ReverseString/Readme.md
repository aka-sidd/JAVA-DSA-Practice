# Reverse String in Java (Brute, Better, Optimal)

This project demonstrates three different approaches to reverse a string in Java.  
The goal is to understand how performance and space usage improve as we move from a brute force solution to an optimal solution.

---

## 📌 Problem Statement

Given a string `s`, reverse the string and return the reversed version.

### Example:
Input:  
Hello

Output:  
olleH


---

## 🛠️ Approaches Used

### 1️⃣ Brute Force Approach
- Creates a new string and appends characters from the end of the original string.
- Uses string concatenation inside a loop.

**Time Complexity:** O(n²)  
**Space Complexity:** O(n)

---

### 2️⃣ Better Approach (Using StringBuilder)
- Uses `StringBuilder` to efficiently append characters.
- Converts the final result back to a string using `toString()`.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### 3️⃣ Optimal Approach (Two Pointer + Char Array)
- Converts the string into a character array.
- Uses two pointers (`left` and `right`) to swap characters in place.
- Converts the character array back into a string.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

## 📂 File Structure

DSAJava.String.ReverseString.java


---

## ▶️ How to Run

1. Clone the repository:
```bash
git clone <your-repo-link>

2.Open the project in IntelliJ or any Java IDE

3.Run the DSAJava.String.ReverseString.java file
```
🎯 Learning Outcome

Difference between brute, better, and optimal approaches

Understanding time and space complexity

Usage of StringBuilder and two-pointer technique in Java


✍️ Author

Siddharth Pandey

Java + DSA Learner | Aspiring Software Developer 🚀