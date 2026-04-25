# 👀 Visible People in a Queue

## 📌 Problem Statement
Given an array `heights`, where each element represents the height of a person standing in a queue, determine how many people each person can see to their right.

---

## 👁️ Visibility Rules
A person can see another person to their right if:
- All people between them are **shorter than both**
- The view is blocked when a person with height **greater than or equal** appears

---

## 🧪 Example

**Input:** [10, 6, 8, 5, 11, 9]


**Output:** [3, 1, 2, 1, 1, 0]


---

## 🐢 Approach 1: Brute Force

### 💡 Idea:
- For each person, check every person to the right
- Track the maximum height in between
- Count visible people until a blocker appears

### ⏱ Complexity:
- Time: **O(n²)**
- Space: **O(1)**

---

## ⚡ Approach 2: Optimized (Monotonic Stack)

### 💡 Idea:
- Traverse from right to left
- Maintain a **monotonic decreasing stack**
- Remove all smaller elements (they are visible)
- If stack is not empty, one more person is visible (blocker)

### ⏱ Complexity:
- Time: **O(n)**
- Space: **O(n)**

---

## 🧠 Key Concepts
- Monotonic Stack
- Next Greater Element Pattern
- Efficient Traversal from Right to Left

---

## 🚀 Learning Outcome
- Understood difference between brute force and optimized approach
- Learned how monotonic stack reduces time complexity
- Strengthened problem-solving for stack-based questions

---




## ✍️ Author
Siddharth Pandey