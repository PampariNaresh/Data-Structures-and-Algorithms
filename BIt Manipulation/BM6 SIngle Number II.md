# Single Number II

## Problem Statement

Given an integer array `nums` where every element appears **three times** except for one, which appears exactly **once**. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

**Example 1:**
*   **Input:** `nums = [2, 2, 3, 2]`
*   **Output:** `3`

**Example 2:**
*   **Input:** `nums = [0, 1, 0, 1, 0, 1, 99]`
*   **Output:** `99`

---

## Intuition and Algorithm

This problem can't be solved by the simple XOR approach used in the "Single Number I" problem, because XORing all elements would cancel out pairs, but we have triplets.

The key insight is to consider the bits of the numbers. If we sum the bits at each position (from 0 to 31) for all the numbers in the array, the sum of the bits at any given position will be a multiple of 3, *unless* the single number has a `1` at that bit position.

Let's break down the algorithm:

1.  Initialize a variable `ans` to `0`. This variable will store the single number we are looking for.
2.  Iterate through each bit position `i` from 0 to 31 (for a 32-bit integer).
3.  For each bit position `i`, we need to count how many numbers in the input array `nums` have this bit set to `1`.
    *   Initialize a `sum_of_bits` to 0 for the current bit position `i`.
    *   Create a mask by left-shifting 1, i.e., `mask = 1 << i`.
    *   Loop through each `num` in the `nums` array.
    *   Check if the `i`-th bit is set for the current `num` by using the mask: `if ((num & mask) != 0)`. 
    *   If the bit is set, increment `sum_of_bits`.
4.  After counting the bits for position `i` across all numbers, we check the `sum_of_bits`.
    *   If `sum_of_bits % 3 != 0`, it means the single number must have a `1` at this bit position `i`.
    *   Why? Because all the triplet numbers contribute either three `0`s or three `1`s at this position, making their total sum a multiple of 3. The single number is the only one that can "break" this pattern.
5.  If the sum is not a multiple of 3, we set the `i`-th bit in our `ans` variable. We do this using a bitwise OR with the mask: `ans = ans | mask`.
6.  After iterating through all 32 bit positions, the `ans` variable will have been constructed bit by bit, and it will be equal to the single number.
7.  Return `ans`.

---

## Dry Run

Let's trace the algorithm with the example `nums = [2, 2, 3, 2]`.

*   `nums = [2, 2, 3, 2]`
*   Binary representations:
    *   `2` is `0010`
    *   `3` is `0011`

Initialize `ans = 0` (binary `0000`).

**Iteration `i = 0` (LSB):**
*   `mask = 1 << 0 = 0001`.
*   Count set bits at position 0:
    *   `2 & 1 = 0`
    *   `2 & 1 = 0`
    *   `3 & 1 = 1`
    *   `2 & 1 = 0`
*   `sum_of_bits = 1`.
*   Check: `1 % 3 != 0`. This is **true**.
*   Update `ans`: `ans = ans | mask` -> `ans = 0000 | 0001 = 0001`.

**Iteration `i = 1`:**
*   `mask = 1 << 1 = 0010`.
*   Count set bits at position 1:
    *   `2 & 2 = 2` (non-zero)
    *   `2 & 2 = 2` (non-zero)
    *   `3 & 2 = 2` (non-zero)
    *   `2 & 2 = 2` (non-zero)
*   `sum_of_bits = 4`.
*   Check: `4 % 3 != 0`. This is **true**.
*   Update `ans`: `ans = ans | mask` -> `ans = 0001 | 0010 = 0011`.

**Iteration `i = 2`:**
*   `mask = 1 << 2 = 0100`.
*   Count set bits at position 2:
    *   `2 & 4 = 0`
    *   `2 & 4 = 0`
    *   `3 & 4 = 0`
    *   `2 & 4 = 0`
*   `sum_of_bits = 0`.
*   Check: `0 % 3 != 0`. This is **false**.
*   `ans` remains `0011`.

**Iteration `i = 3` (and all higher bits):**
*   The sum of bits will be 0, so `ans` will not be updated further.

**Final Result:**
*   After all iterations, `ans` is `0011` in binary, which is **3** in decimal. The algorithm correctly finds the single number.

---

## Java Implementation

```java
class Solution {
    public int singleNumber(int[] nums) {
        // ans will store the single number
        int ans = 0;

        // Iterate through each bit position (0 to 31)
        for (int i = 0; i < 32; i++) {
            int sum_of_bits = 0;
            int mask = 1 << i;

            // For the current bit 'i', count how many numbers have it set
            for (int num : nums) {
                if ((num & mask) != 0) {
                    sum_of_bits++;
                }
            }

            // If the sum of bits is not a multiple of 3,
            // the single number must have this bit set.
            if (sum_of_bits % 3 != 0) {
                ans = ans | mask;
            }
        }

        return ans;
    }
}
```
