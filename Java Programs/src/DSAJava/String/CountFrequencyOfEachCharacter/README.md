# Character Frequency Counter (Brute → Better → Optimal)

This project demonstrates **three approaches** to count the frequency of each character in a string using **Java**:

1. **Brute Force** – Simple logic, easy to understand
2. **Better (Array / ASCII)** – Faster using a frequency array
3. **Optimal (HashMap)** – Clean, scalable, interview‑ready

---

## 📌 Problem Statement

Given a string, count how many times each character appears and **print each character only once with its total frequency**.

### Example

```
Input:  aabbbcc
Output:
a -> 2
b -> 3
c -> 2
```

---

## 🥉 1. Brute Force Approach

### 🧠 Idea

For every character in the string:

1. Check if it already appeared before (to avoid duplicate printing)
2. If it is the first occurrence, scan the full string and count its frequency
3. Print the result

---

### ✅ Logic Flow

```
For each index i:
  Check past characters (0 → i-1)
  If character found → skip
  Else:
     Count occurrences in full string
     Print character and count
```

---

### 💻 Code

```java
public class Main {
    public static void main(String[] args) {
        String s = "aabbbcc";

        for (int i = 0; i < s.length(); i++) {

            boolean alreadyCounted = false;

            // Check past characters
            for (int k = 0; k < i; k++) {
                if (s.charAt(i) == s.charAt(k)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) continue;

            int count = 0;

            // Count full string
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            System.out.println(s.charAt(i) + " -> " + count);
        }
    }
}
```

---

### ⏱️ Complexity

| Type  | Value |
| ----- | ----- |
| Time  | O(N²) |
| Space | O(1)  |

---

## 🥈 2. Better Approach (Using ASCII Frequency Array)

### 🧠 Idea

Instead of counting repeatedly:

* Use an array of size **256** (ASCII characters)
* Store frequency of each character
* Print each character only on its first appearance

---

### 💻 Code

```java
public class Main {
    public static void main(String[] args) {
        String s = "aabbbcc";

        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        boolean[] printed = new boolean[256];

        // Print first occurrence only
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!printed[ch]) {
                System.out.println(ch + " -> " + freq[ch]);
                printed[ch] = true;
            }
        }
    }
}
```

---

### ⏱️ Complexity

| Type  | Value             |
| ----- | ----------------- |
| Time  | O(N)              |
| Space | O(256) (constant) |

---

## 🥇 3. Optimal Approach (Using HashMap)

### 🧠 Idea

Store:

```
Character → Frequency
```

Using a HashMap, which works for:

* Any character set
* Unicode
* Clean interview‑friendly code

---

### 💻 Code

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "aabbbcc";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            System.out.println(ch + " -> " + map.get(ch));
        }
    }
}
```

---

### ⏱️ Complexity

| Type  | Value |
| ----- | ----- |
| Time  | O(N)  |
| Space | O(N)  |

---

## 🔥 Comparison Table

| Approach          | Speed | Space    | Best Use Case           |
| ----------------- | ----- | -------- | ----------------------- |
| Brute Force       | Slow  | Low      | Learning logic          |
| Better (Array)    | Fast  | Constant | ASCII characters        |
| Optimal (HashMap) | Fast  | Medium   | Interviews & real‑world |

---

## 🧠 Key Takeaways

* **Brute** → Count every time, print only first occurrence
* **Better** → Store counts in array (ASCII)
* **Optimal** → Store counts in HashMap (scalable & clean)

---

## 📂 Project Structure (Suggested)

```
character-frequency/
│
├── brute/
│   └── BruteForce.java
│
├── better/
│   └── BetterApproach.java
│
├── optimal/
│   └── OptimalApproach.java
│
└── README.md
```

---

## 🚀 Author

**Siddharth Pandey**
Learning DSA & Java | FAANG‑Focused Preparation

---

## ⭐ If You Found This Helpful

Give this repository a **star** and keep grinding! 💪🔥

---

# Professional README.md (Updated)

## Character Frequency Counter — Brute, Better & Optimal (Java)

This project demonstrates **three different approaches** to count the frequency of each character in a given string, written in **clean, professional Java** with proper **separation of concerns**.

The logic is divided into:

* **Computation functions** → Only calculate and return results
* **Controller (`main`)** → Takes user input and controls flow
* **Printer function** → Handles all output formatting

This design makes the code **reusable, testable, and interview‑ready**.

---

## 📌 Problem Statement

Given a string, count how many times each character appears and print:

```
character -> frequency
```

Each character should be printed **only once**, in the order of its **first appearance**.

### Example

**Input:**

```
programming
```

**Output:**

```
p -> 1
r -> 2
o -> 1
g -> 2
a -> 1
m -> 2
i -> 1
n -> 1
```

---

## 🧠 Design Principles Used

### Separation of Concerns

| Component            | Responsibility                          |
| -------------------- | --------------------------------------- |
| `frequencyBrute()`   | Compute frequency using nested loops    |
| `frequencyBetter()`  | Compute frequency using ASCII array     |
| `frequencyOptimal()` | Compute frequency using `LinkedHashMap` |
| `printResult()`      | Display output neatly                   |
| `main()`             | Take input and control program flow     |

All computation functions **return the same data type**:

Map<Character, Integer>

So the calling code does not depend on how the frequency was calculated.

---

## 📂 Project Structure

```
character-frequency/
│
├── src/
│   └── CharacterFrequency.java
│
└── README.md
```

---

## 🥉 Brute Force Approach

### Idea

* For each character in the string:

    * Check if it already appeared before
    * If not, scan the full string and count its frequency
    * Store result in a map

### Time & Space

| Type  | Complexity |
| ----- | ---------- |
| Time  | O(N²)      |
| Space | O(1)       |

---

## 🥈 Better Approach (ASCII Array)

### Idea

* Use an integer array of size **256** to store frequency of ASCII characters
* Use a boolean array to track visited characters
* Convert the result into a `LinkedHashMap` for clean, ordered output

### Time & Space

| Type  | Complexity        |
| ----- | ----------------- |
| Time  | O(N)              |
| Space | O(256) (constant) |

---

## 🥇 Optimal Approach (LinkedHashMap)

### Idea

* Use `LinkedHashMap<Character, Integer>` directly
* Count frequency in a single pass
* Preserve order of first appearance automatically

### Time & Space

| Type  | Complexity |
| ----- | ---------- |
| Time  | O(N)       |
| Space | O(N)       |

---

## ▶️ How to Run

### 1. Compile

```bash
javac CharacterFrequency.java
```

### 2. Run

```bash
java CharacterFrequency
```

### 3. Input

When prompted, enter any string:

```bash
Enter a string: aabbbcc
```

---

## 🔍 Sample Output

```
Brute Force Result
---------------------
a -> 2
b -> 3
c -> 2

Better Approach Result
---------------------
a -> 2
b -> 3
c -> 2

Optimal Approach Result (LinkedHashMap)
---------------------
a -> 2
b -> 3
c -> 2
```

---

## 💡 Why `LinkedHashMap`?

* Preserves **insertion order**
* Ensures output follows the **first appearance of characters in the string**
* Provides clean and predictable results compared to `HashMap`

---

## 🎯 Interview Talking Points

* "All approaches return a `Map<Character, Integer>` to keep a consistent interface. The internal logic changes, but the output format stays the same."
* "I use `LinkedHashMap` to preserve the order of first appearance while maintaining O(N) performance."
* "Separation of concerns improves testability and reusability."

---

## 🚀 Future Improvements

* Add **JUnit tests** to validate all three approaches produce identical results
* Extend support for **Unicode characters** using `Map` instead of ASCII arrays
* Add sorting by frequency feature

---

## 👤 Author

**Siddharth Pandey**
Java & DSA Learner | FAANG‑Focused Preparation

---

## ⭐ If You Like This Project

Give this repository a **star** and keep building clean, professional code! 💪🔥
