**Single Number I**
**Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.**

Input: nums = [4,1,2,1,2]
Output: 4


**Brute Force**
Using the HashMap

**Better Approach**

a^a =0(property is used)
nums =[4,1,2,1,2]
int n = nums.length;
ans =nums[0]
for(int i=1;i<n;i++) {
ans = ans ^ nums[i];
}
return  ans;