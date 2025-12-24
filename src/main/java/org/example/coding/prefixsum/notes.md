# Prefix Sum (DSA Pattern)

## What is Prefix Sum?
Prefix Sum at index `i` is the sum of elements from index `0` to `i`.

prefix[i] = arr[0] + arr[1] + ... + arr[i]

---

## Example
Array:
arr = [2, 4, 1, 3]

Prefix Sum:
prefix = [2, 6, 7, 10]

---

## How to Build Prefix Sum
prefix[0] = arr[0]

for i = 1 to n-1:
prefix[i] = prefix[i-1] + arr[i]

---

## Why Prefix Sum?
- Helps to calculate subarray sum quickly
- Avoids repeated summation
- Converts O(n) range sum to O(1)

---

## Subarray Sum Formula
To find sum from index L to R:

If L == 0:
sum = prefix[R]
Else:
sum = prefix[R] - prefix[L-1]

---

## Key Insight
If:
prefix[j] - prefix[i] = K

Then:
Subarray (i+1 to j) has sum = K

---

## When to Use Prefix Sum
- Range sum queries
- Subarray sum problems
- Counting subarrays
- Negative numbers present

---

## Common Mistakes
- Forgetting L == 0 case
- Off-by-one errors (L-1)
- Using sliding window with negatives

---

## Prefix Sum = DSA Pattern
- Reusable idea
- Used in many problems
- Often combined with HashMap

---

## Mental Model
Prefix sum = running total till current index


# Prefix Sum Practice Problems (Easy → Hard)

## 🟢 Easy (Build Foundation)

1. Find prefix sum array of a given array
2. Find sum of elements from index L to R
3. Answer multiple range sum queries
4. Find sum of entire array using prefix sum
5. Check if there exists a subarray with sum = K (positive numbers only)
6. Find total sum of all subarrays
7. Find sum of first K elements using prefix sum
8. Find prefix maximum sum array
9. Find prefix minimum sum array
10. Find number of elements whose prefix sum is even

---

## 🟡 Medium (Core Pattern Mastery)

11. Count subarrays with sum equal to K
12. Find longest subarray with sum equal to K
13. Find subarray with sum = 0
14. Count subarrays with sum = 0
15. Find longest subarray with equal number of 0s and 1s
16. Find number of subarrays with sum divisible by K
17. Find subarray with given XOR K (Prefix XOR)

---

## 🔴 Hard (Advanced & Interview Level)

18. Count subarrays with equal number of even and odd elements
19. Find maximum length subarray with same sum in two arrays
20. Count number of submatrices with sum equal to K (2D Prefix Sum)

---

## How to Practice These Problems
- Solve Easy without HashMap
- Solve Medium using Prefix Sum + HashMap
- Hard problems require transformation + prefix logic

---

## Mastery Tip
If you can confidently solve problems **11–17**,
you have fully mastered the **Prefix Sum DSA Pattern**.
