# Square Root of N using Binary Search (Java)

## 📌 Overview

This project computes the **square root of a number (√n)** using an efficient
**Binary Search** approach instead of linear iteration.

The algorithm returns the **floor value** of the square root in **O(log n)** time.

---

## 🔍 Problem Statement

Given a **non-negative integer `n`**, find:

* The **floor value of √n**
* Without using built-in square root functions

Example:

```
n = 27
√27 ≈ 5.19 → floor = 5
```

---

## 🧠 Approach (Binary Search)

1. Search in range **[1, n/2]** (since √n ≤ n/2 for n ≥ 2).
2. Compute:

   ```
   mid * mid
   ```
3. Compare with `n`:

    * If equal → return `mid`
    * If smaller → store answer and move **right**
    * If larger → move **left**
4. Final stored value = **floor square root**.

---

## ⏱ Complexity Analysis

| Metric           | Value        |
| ---------------- | ------------ |
| Time Complexity  | **O(log n)** |
| Space Complexity | **O(1)**     |

---

## ▶️ How to Run

### Compile

```
javac SqrtOfNBinarySearch.java
```

### Run

```
java SqrtOfNBinarySearch
```

---

## 📂 Example

```
Input: 27
Output: 5
```

---

## 🚀 Why This Problem is Important

* Classic **binary search on numbers** problem
* Asked in **coding interviews & competitive programming**
* Foundation for:

    * **Nth root problems**
    * **Binary search on answer**
    * **Precision-based searching**

---

## 👨‍💻 Author

**Siddharth Pandey**

---
