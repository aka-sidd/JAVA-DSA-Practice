# First & Last Occurrence in Sorted Array (Binary Search - Java)

## 📌 Overview

This project finds the **first** and **last occurrence** of a target element in a **sorted array** using the **Binary Search** technique.

Binary search reduces the search space by half each step, giving an efficient **O(log n)** solution.

---

## 🔍 Problem Statement

Given a **sorted integer array** and a **target value**, return:

* **First occurrence index** (leftmost position)
* **Last occurrence index** (rightmost position)

If the target is **not present**, return **-1**.

---

## 🧠 Approach

### 1️⃣ First Occurrence

* When `arr[mid] == target`

    * Store index in `ans`
    * Move **left** → `right = mid - 1`
* Continue searching to find the **earliest position**

---

### 2️⃣ Last Occurrence

* When `arr[mid] == target`

    * Store index in `ans`
    * Move **right** → `left = mid + 1`
* Continue searching to find the **latest position**

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
javac FirstLastOccurrence.java
```

### Run

```
java FirstLastOccurrence
```

---

## 📂 Example

```
Array: [1, 2, 4, 4, 4, 5, 7]
Target: 4

First Occurrence Index: 2
Last Occurrence Index: 4
```

---

## 🚀 Use Cases

* Count frequency of an element
* Range queries in sorted data
* Competitive programming & coding interviews
* Database/search engine indexing logic

---

## 👨‍💻 Author

**Siddharth Pandey**

---

⭐ If this helped you, consider **starring the repository**!
