# Count Frequency in Sorted Array (Binary Search - Java)

## 📌 Overview

This project counts how many times a **target element** appears in a **sorted array** using the **Binary Search** technique.

Instead of scanning the whole array (**O(n)**), binary search finds the answer in **O(log n)** time.

---

## 🔍 Problem Statement

Given a **sorted integer array** and a **target value**, return the **frequency (count)** of the target.

If the target is **not present**, return **0**.

---

## 🧠 Approach

### Step 1 — Find First Occurrence

* Use binary search.
* When `arr[mid] == target`:

    * Store index.
    * Move **left** → `right = mid - 1`
      (to find earliest position).

---

### Step 2 — Find Last Occurrence

* Again apply binary search.
* When `arr[mid] == target`:

    * Store index.
    * Move **right** → `left = mid + 1`
      (to find latest position).

---

### Step 3 — Compute Frequency

```
frequency = lastIndex − firstIndex + 1
```

If **firstIndex = -1**, frequency is **0**.

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
javac CountFrequencyBinarySearch.java
```

### Run

```
java CountFrequencyBinarySearch
```

---

## 📂 Example

```
Array: [1, 2, 4, 4, 4, 5, 7]
Target: 4

Frequency: 3
```

---

## 🚀 Use Cases

* Finding **duplicate counts** in sorted data
* **Range queries** in databases/search systems
* **Competitive programming** problems
* Common **coding interview** question

---

## 👨‍💻 Author

**Siddharth Pandey**

---

