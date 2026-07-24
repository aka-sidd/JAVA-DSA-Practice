# Two Sum (Complement Pattern)

## Problem

Given an integer array `arr` and a target value `target`, return the
indices of the two numbers whose sum is equal to `target`.

Example:

Input:

``` text
arr = [10, 15, 3, 7]
target = 17
```

Output:

``` text
[0, 3]
```

------------------------------------------------------------------------

## Human Thinking

Instead of checking every possible pair:

-   10 + 15
-   10 + 3
-   10 + 7
-   ...

Ask a better question:

> If the current number is `10`, what number do I need to reach `17`?

    complement = target - current

Now the problem becomes:

> Does the complement already exist?

This idea is called the **Complement Pattern**.

------------------------------------------------------------------------

## Brute Force

Compare every pair.

``` java
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==target){
            return new int[]{i,j};
        }
    }
}
return new int[]{-1,-1};
```

### Complexity

-   Time: O(N²)
-   Space: O(1)

------------------------------------------------------------------------

## Optimization

Instead of searching the whole array for the complement every time,
store previously seen numbers in a HashMap.

Store:

    Number -> Index

Example:

    10 -> 0
    15 -> 1
    3  -> 2

Algorithm:

1.  Calculate `complement = target - current`
2.  If complement exists in the HashMap, return its index and the
    current index.
3.  Otherwise store the current number and its index.

------------------------------------------------------------------------

## Optimal Code

``` java
import java.util.HashMap;

public static int[] twoSum(int[] arr, int target){

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0;i<arr.length;i++){

        int current = arr[i];
        int complement = target - current;

        if(map.containsKey(complement)){
            return new int[]{map.get(complement), i};
        }

        map.put(current, i);
    }

    return new int[]{-1,-1};
}
```

------------------------------------------------------------------------

## Complexity

-   Time: O(N)
-   Space: O(N)

------------------------------------------------------------------------

## Interview Takeaway

-   Brute Force: Compare every pair.
-   Observation: Only the complement matters.
-   Data Structure: HashMap because we need both lookup and index.
-   Pattern Name: **Complement Pattern**.
