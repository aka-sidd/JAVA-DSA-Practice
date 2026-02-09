# Peak Element using Binary Search (Java)

## 📌 Overview

This project finds a **peak element** in an array using an efficient **Binary Search** approach.

A **peak element** is an element that is **greater than or equal to its neighbors**.

The algorithm runs in **O(log n)** time instead of **O(n)** linear scan.

---

## 🔍 Problem Statement

Given an integer array, return the **index of any peak element**.

### Conditions

* `arr[i] ≥ arr[i-1]`
* `arr[i] ≥ arr[i+1]`
* Elements outside the array are considered **−∞**

---

## 🧠 Key Idea

Use **binary search on the slope** of the array:

* If `arr[mid] < arr[mid + 1]`
  → Peak lies in the **right half**
  → Move `left = mid + 1`

* Else
  → Peak lies in the **left half (including mid)**
  → Move `right = mid`

When `left == right`, we found a **peak index**.

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
javac PeakElementBinarySearch.java
```

### Run

```
java PeakElementBinarySearch
```

---

## 📂 Example

```
Array: [1, 3, 20, 4, 1, 0]

Peak element index: 2
Peak element value: 20
```

---

## 🚀 Why This Problem is Important

* Classic **binary search variation**
* Frequently asked in **coding interviews**
* Builds intuition for:

    * **Mountain array problems**
    * **Bitonic search**
    * **Optimization problems**

---

## 👨‍💻 Author

**Siddharth Pandey**

---

