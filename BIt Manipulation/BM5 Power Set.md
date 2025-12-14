# Power Set

The **power set** of a set S is the set of all possible subsets of S, including the empty set and the set S itself.

If the original set S has `n` elements, then its power set will have `2^n` elements.

**Example:**

If S = `{1, 2, 3}`, then its power set P(S) is:
`P(S) = {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}`

Here `n = 3`, so the number of subsets is `2^3 = 8`.

## Generating Power Set using Bit Manipulation

We can use bit manipulation to efficiently generate all subsets of a given set. The idea is to associate each subset with the binary representation of a number.

For a set with `n` elements, we can iterate through all numbers from `0` to `2^n - 1`. Each of these numbers can be represented with `n` bits in binary. Each bit in the binary representation corresponds to an element in the set.

- If the `i`-th bit is `1`, it means the `i`-th element of the set is included in the current subset.
- If the `i`-th bit is `0`, the `i`-th element is not included.

**Example with S = {a, b, c}**

Here, `n = 3`. We will iterate from `0` (binary `000`) to `7` (binary `111`).

| Number | Binary | Subset |
| :--- | :---: | :--- |
| 0 | 000 | {} |
| 1 | 001 | {c} |
| 2 | 010 | {b} |
| 3 | 011 | {b, c} |
| 4 | 100 | {a} |
| 5 | 101 | {a, c} |
| 6 | 110 | {a, b} |
| 7 | 111 | {a, b, c} |

*(Note: In this example, we associate the 0th bit with 'c', 1st bit with 'b', and 2nd bit with 'a' assuming right to left bit processing, or can be the other way around as long as it's consistent.)*

### Algorithm

1. Let `n` be the number of elements in the input array `nums`.
2. The total number of subsets is `2^n`, which can be calculated using `1 << n`.
3. Initialize an empty list `ans` which will store all the subsets.
4. Loop through each number `num` from `0` to `2^n - 1`.
5. For each `num`, create an empty list `subset` to store the current subset.
6. Iterate from `i = 0` to `n-1`. This `i` represents the `i`-th element of the input array.
7. Inside this loop, check if the `i`-th bit is set in `num`. This can be done using the expression `(num & (1 << i)) != 0`.
8. If the bit is set, it means the `i`-th element should be in the current subset, so add `nums[i]` to `subset`.
9. After checking all the bits for `num`, add the generated `subset` to the `ans` list.
10. After the outer loop finishes, `ans` will contain all the possible subsets (the power set). Return `ans`.

### Java Implementation

Here is a corrected and detailed Java implementation for finding the power set of an array of integers.

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Given an integer array nums of unique elements, return all possible subsets (the power set).
     * The solution set must not contain duplicate subsets. You can return the solution in any order.
     * @param nums The input array of unique integers.
     * @return A list of lists, where each inner list is a subset.
     */
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        // There will be 2^n subsets. 1 << n is a way to calculate 2^n.
        int numSubsets = 1 << n;
        
        List<List<Integer>> ans = new ArrayList<>(numSubsets);

        // Iterate from 0 to 2^n - 1. Each number represents a subset.
        for (int num = 0; num < numSubsets; num++) {
            List<Integer> subset = new ArrayList<>();
            
            // For each number, check its bits to form a subset.
            for (int i = 0; i < n; i++) {
                // Check if the i-th bit is set in 'num'.
                // (1 << i) creates a mask with only the i-th bit set.
                // e.g., i=0 -> 001, i=1 -> 010, i=2 -> 100
                // If the bitwise AND is not 0, the bit is set.
                if ((num & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            ans.add(subset);
        }
        
        return ans;
    }
}
```
