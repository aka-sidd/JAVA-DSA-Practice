# Nth Root of a Number using Binary Search (Java)

## 📌 Overview

This project finds the **Nth root of a number `m`** using an efficient
**Binary Search** approach.

Instead of linear checking, the solution runs in **O(log m)** time.

---

## 🔍 Problem Statement

Given two integers:

* `n` → root power
* `m` → number

Find:

```
x such that x^n = m
```

Return:

* **x** if exact integer root exists
* **-1** otherwise

---

## 🧠 Approach (Binary Search on Answer)

1. Search in range:

```
[1, m]
```

2. For each **mid**, compute:

```
mid^n
```

3. Compare with **m**:

* If equal → return **mid**
* If smaller → move **right**
* If larger → move **left**

4. If loop ends → **no integer root exists → return -1**

---

## ⚠️ Overflow Handling

While computing:

```
mid^n
```

we **stop early** if value becomes **greater than m**
to avoid **integer overflow**.

---

## ⏱ Complexity Analysis

| Metric           | Value            |
| ---------------- | ---------------- |
| Time Complexity  | **O(log m × n)** |
| Space Complexity | **O(1)**         |

---

## ▶️ How to Run

### Compile

```
javac NthRootBinarySearch.java
```

### Run

```
java NthRootBinarySearch
```

---

## 📂 Example

```
Input:
n = 3
m = 27

Output:
3
```

```
Input:
n = 2
m = 10

Output:
-1
```

---

## 🚀 Why This Problem is Important

* Classic **Binary Search on Answer** problem
* Frequently asked in **product-based company interviews**
* Foundation for:

    * **Koko Eating Bananas**
    * **Minimum Days to Make Bouquets**
    * **Allocation problems**

---

## 👨‍💻 Author

**Siddharth Pandey**

---

