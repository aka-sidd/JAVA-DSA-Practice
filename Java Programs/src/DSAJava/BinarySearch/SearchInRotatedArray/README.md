# Search in Rotated Sorted Array (Binary Search - Java)

## 📌 Overview

This project searches a **target element** inside a **rotated sorted array** using an optimized **Binary Search** approach.

A rotated sorted array is originally sorted but then rotated at some pivot.

Example:

```
Original: [0, 1, 2, 4, 5, 6, 7]
Rotated : [4, 5, 6, 7, 0, 1, 2]
```

---

## 🔍 Problem Statement

Given:

* A **rotated sorted array**
* A **target value**

Return:

* The **index** of the target if found
* Otherwise return **-1**

---

## 🧠 Key Idea

At least **one half of the array is always sorted**.

### Steps:

1. Find **mid** using binary search.
2. Check which half is **sorted**:

    * **Left sorted** → `arr[left] ≤ arr[mid]`
    * **Right sorted** → otherwise
3. Decide where the **target lies** and move accordingly.

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
javac SearchRotatedSortedArray.java
```

### Run

```
java SearchRotatedSortedArray
```

---

## 📂 Example

```
Array: [4, 5, 6, 7, 0, 1, 2]
Target: 0

Output: 4
```

---

## 🚀 Why This Problem is Important

* Very **common interview question**
* Tests understanding of **modified binary search**
* Used in **competitive programming** and **search systems**

---

## 👨‍💻 Author

**Siddharth Pandey**

---

