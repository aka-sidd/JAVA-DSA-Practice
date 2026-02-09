# Minimum Days to Make Bouquets (Binary Search on Answer - Java)

## 📌 Overview

This project finds the **minimum number of days** required to make
`m` bouquets where each bouquet needs **k adjacent flowers**.

Solved using **Binary Search on Answer** for optimal efficiency.

---

## 🔍 Problem Statement

Given:

* `bloomDay[]` → day each flower blooms
* `m` → required bouquets
* `k` → flowers per bouquet (must be **adjacent**)

Return:

```
Minimum days needed to make m bouquets
```

If impossible → return **-1**.

---

## 🧠 Key Idea — Binary Search on Days

### Search Space

```
[min(bloomDay), max(bloomDay)]
```

### Feasibility Check

For a chosen **day D**:

* Count **adjacent bloomed flowers**
* Every `k` flowers → **1 bouquet**
* If bouquets ≥ `m` → D is **valid**

Then try **smaller day** to minimize answer.

---

## ⚠️ Important Edge Case

If:

```
m × k > total flowers
```

➡️ Impossible → return **-1**

---

## ⏱ Complexity Analysis

| Metric           | Value              |
| ---------------- | ------------------ |
| Time Complexity  | **O(n log range)** |
| Space Complexity | **O(1)**           |

---

## ▶️ How to Run

### Compile

```
javac MinimumDaysToMakeBouquets.java
```

### Run

```
java MinimumDaysToMakeBouquets
```

---

## 📂 Example

```
Input:
bloomDay = [1, 10, 3, 10, 2]
m = 3
k = 1

Output:
3
```


---

## 👨‍💻 Author

**Siddharth Pandey**

---

