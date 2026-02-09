# Upper & Lower Bound in Java (Binary Search)

## 📌 Overview

This project implements **Lower Bound** and **Upper Bound** using the **Binary Search** technique in Java.

Binary search helps find positions in a **sorted array** in **O(log n)** time complexity.

---

## 🔍 Definitions

### 1️⃣ Lower Bound

* Returns the **first index where value ≥ target**
* If all elements are smaller than target → returns **array length**

Example:

```
Array: [1, 2, 4, 4, 4, 5, 7]
Target: 4
Lower Bound Index: 2
```

---

### 2️⃣ Upper Bound

* Returns the **first index where value > target**
* If no element is greater → returns **array length**

Example:

```
Array: [1, 2, 4, 4, 4, 5, 7]
Target: 4
Upper Bound Index: 5
```

---

## ⚙️ Time & Space Complexity

| Operation     | Complexity   |
| ------------- | ------------ |
| Binary Search | **O(log n)** |
| Space Usage   | **O(1)**     |

---

## 🧠 Key Concepts Used

* Sorted array requirement
* Binary search narrowing technique
* Mid Calculation using:

  ```java
  int mid = left + (right - left) / 2;
  ```

  (prevents integer overflow)

---

## ▶️ How to Run

1. Compile the file:

   ```
   javac UpperLowerBound.java
   ```

2. Run the program:

   ```
   java UpperLowerBound
   ```

---

## 📂 Output Example

```
Array: [1, 2, 4, 4, 4, 5, 7]
Target: 4
Lower Bound index: 2
Upper Bound index: 5
```

---

## 🚀 Why This is Important

* Frequently asked in **coding interviews**
* Used in:

    * Searching in sorted arrays
    * Finding frequency of elements
    * Range queries
    * Competitive programming

---

## 👨‍💻 Author

**Siddharth Pandey**

---

⭐ If you found this helpful, consider giving this repo a **star**!
