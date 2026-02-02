# Remove Outermost Parentheses (Java)

This project implements three different approaches to solve the **Remove Outermost Parentheses** problem using Java.  
The goal is to remove the outermost pair of parentheses from every primitive valid parentheses string in the given input.

---

## 🧠 Problem Statement

Given a valid parentheses string, split it into primitive strings.  
A primitive string is a non-empty valid parentheses string that cannot be split into smaller valid parts.  
Remove the outermost parentheses of each primitive string and return the final result.

### Example

**Input:**
(()())(())(()(()))


**Output:**
()()()()(())

---

## 📂 Project Structure

RemoveOutermostParentheses.java


The file contains:
- Brute Force approach
- Better approach using balance count
- Optimal approach using `StringBuilder`

---

## 🚀 Approaches Explained

### 1. Brute Force Approach
- Builds each primitive substring separately.
- Once a primitive string is complete, removes the first and last character.
- Appends the remaining part to the result.

**Time Complexity:** O(n²)  
**Space Complexity:** O(n)

---

### 2. Better Approach
- Uses a balance counter to track open and close parentheses.
- Skips the outermost parentheses by checking the balance before adding characters to the result.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### 3. Optimal Approach
- Same logic as the better approach.
- Uses `StringBuilder` instead of string concatenation for better performance.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone <your-repo-url>
Compile the code:

javac RemoveOutermostParentheses.java


Run the program:

java RemoveOutermostParentheses

🧪 Sample Output
Input: (()())(())(()(()))

Brute Output:   ()()()()(())

Better Output: ()()()()(())

Optimal Output: ()()()()(())

🎯 Key Learning

Understanding primitive valid parentheses strings

Using balance counting technique

Performance difference between String and StringBuilder

📌 Author

Siddharth Pandey
(Java & DSA Practice)

