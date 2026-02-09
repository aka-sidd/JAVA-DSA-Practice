# Single Element in Sorted Array (Binary Search - Java)

## 📌 Overview

This project finds the **single non-duplicate element** in a **sorted array** where:

* Every element appears **exactly twice**
* Only **one element appears once**

The solution uses **Binary Search** to achieve **O(log n)** time.

---

## 🔍 Problem Statement

Given a **sorted integer array**:

* All elements appear **twice except one**
* Return the **single non-duplicate element**

---

## 🧠 Key Idea

### Pair Pattern in Sorted Array

Before the single element:

```
index: even, odd → correct pairs
```

After the single element:

```
index: odd, even → shifted pairs
```

### Binary Search Logic

1. Make `mid` **even** to check pair start.
2. Compare:

    * If `arr[mid] == arr[mid + 1]`
      → Single element is on the **right side**
    * Else
      → Single element is on the **left side (including mid)**

When `left == right`, we found the answer.

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
javac SingleElementSortedArray.java
```

### Run

```
java SingleElementSortedArray
```

---

## 📂 Example

```
Array: [1, 1, 2, 2, 3, 4, 4, 5, 5]

Output: 3
```

---

## 🚀 Why This Problem is Important

* Classic **binary search index pattern** question
* Frequently asked in **FAANG / product-based interviews**
* Builds intuition for **pair indexing & search space reduction**

---

## 👨‍💻 Author

**Siddharth Pandey**

---

