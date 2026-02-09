# Find Minimum in Rotated Sorted Array (Binary Search - Java)

## 📌 Overview

This project finds the **minimum element** in a **rotated sorted array** using an optimized **Binary Search** approach.

A rotated sorted array is originally sorted in ascending order but rotated at some pivot.

Example:

```
Original: [0, 1, 2, 4, 5, 6, 7]
Rotated : [4, 5, 6, 7, 0, 1, 2]
```

---

## 🔍 Problem Statement

Given:

* A **rotated sorted array** of distinct integers

Return:

* The **minimum element** in the array

The solution must run in **O(log n)** time.

---

## 🧠 Key Idea

Compare the **middle element** with the **rightmost element**:

* If `arr[mid] > arr[right]`
  → Minimum lies in the **right half**
  → Move `left = mid + 1`

* Else
  → Minimum lies in the **left half (including mid)**
  → Move `right = mid`

Continue until `left == right`.

The minimum element is:

```
arr[left]
```

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
javac FindMinimumRotatedArray.java
```

### Run

```
java FindMinimumRotatedArray
```

---

## 📂 Example

```
Array: [4, 5, 6, 7, 0, 1, 2]

Minimum element: 0
```

---

## 🚀 Why This Problem is Important

* Very **common coding interview question**
* Tests understanding of **modified binary search**
* Foundation for:

    * **Rotation count problems**
    * **Searching in rotated arrays**
    * **Advanced binary search patterns**

---

## 👨‍💻 Author

**Siddharth Pandey**

---

