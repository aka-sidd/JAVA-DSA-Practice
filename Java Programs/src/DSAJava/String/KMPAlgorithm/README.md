# KMP Algorithm in Java

This project contains a simple Java program to find a pattern inside a given text using the KMP (Knuth-Morris-Pratt) algorithm.

I made this to understand how string matching can be done in a faster way compared to the normal brute force approach.

---

## What is KMP Algorithm?

KMP is a string searching algorithm.  
It checks whether a pattern exists in a text.

The main idea of KMP is that when a mismatch happens, we do not start matching the pattern from the beginning again.  
Instead, we use an extra array called **LPS (Longest Prefix Suffix)** to know how much we can skip.

---

## Files in this Project

KMPAlgorithm.java

README.md


---

## Example

### Input
Text: ababcabcabababd

Pattern: ababd


### Output
Pattern found at index: 10


---

## How to Run the Program

### Step 1: Compile
```bash
javac KMPAlgorithm.java
```
Step 2: Run
````
java KMPAlgorithm
````
Time Complexity

LPS creation: O(M)

Pattern searching: O(N)

Total: O(N + M)

Where:

N = length of text

M = length of pattern

````
Notes

This program prints the starting index where the pattern is found.

If the pattern is not found, it prints Pattern not found.



