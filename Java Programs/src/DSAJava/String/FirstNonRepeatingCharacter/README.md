📘 First Non-Repeating Character in a String
📌 Problem Statement

Given a string, find the first character that does not repeat anywhere in the string.
If no such character exists, return #.

🧠 Approach Overview

This repository demonstrates three different approaches to solve the problem, showing how the solution can be optimized step by step.

````
🥉 Brute Force Approach
Idea

For every character in the string, scan the entire string again and count how many times it appears.
The first character whose count is exactly 1 is the answer.

Characteristics

Simple and easy to understand

Not efficient for large strings

Good for building basic problem-solving logic

Complexity

Time Complexity: O(N²)

Space Complexity: O(1)


🥈 Better Approach (Frequency Array)
Idea

Use an array to store the frequency of each character in a single pass.
Then scan the string again to find the first character whose frequency is 1.

Characteristics

Faster than brute force

Works well when the character set is limited (e.g., lowercase English letters)

Introduces the concept of pre-processing

Complexity

Time Complexity: O(N)

Space Complexity: O(1)


🥇 Optimal Approach (LinkedHashMap)
Idea

Use a map to store character → frequency while maintaining the insertion order.
Then iterate over the map to find the first character with frequency 1.

Characteristics

Handles any character set

Maintains original order of characters

Clean and scalable solution for real-world inputs

Complexity:

Time Complexity: O(N)

Space Complexity: O(N)
````
