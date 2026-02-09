# Koko Eating Bananas (Binary Search on Answer - Java)

## 📌 Overview

This project solves the classic **Koko Eating Bananas** problem using
**Binary Search on Answer**.

Goal:
Find the **minimum eating speed** so Koko finishes all banana piles
within **H hours**.

---

## 🔍 Problem Statement

Given:

* `piles[]` → bananas in each pile
* `h` → total hours available

Koko can:

* Choose an **integer speed k**
* Eat **k bananas per hour from one pile**

Return:

```
Minimum k such that all bananas are eaten within h hours
```

---

## 🧠 Key Idea — Binary Search on Answer

### Search Space

```
Speed range → [1, max(pile)]
```

### Check Function

For a given speed **k**:

```
hours = Σ ceil(pile / k)
```

If:

```
hours ≤ h → speed is valid
```

Then try **smaller speed** to minimize answer.

---

## ⚠️ Important Trick — Ceiling Division

Instead of:

```
Math.ceil(pile / k)
```

Use:

```
(pile + k - 1) / k
```

➡️ Faster and avoids floating-point operations.

---

## ⏱ Complexity Analysis

| Metric           | Value                |
| ---------------- | -------------------- |
| Time Complexity  | **O(n log maxPile)** |
| Space Complexity | **O(1)**             |

---

## ▶️ How to Run

### Compile

```
javac KokoEatingBananas.java
```

### Run

```
java KokoEatingBananas
```

---

## 📂 Example

```
Input:
piles = [3, 6, 7, 11]
h = 8

Output:
4
```

## 👨‍💻 Author

**Siddharth Pandey**

---

