package leetcode.arrays.easy;
/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

import java.util.HashMap;
import java.util.Map;

// Strategy: use a HashMap to store seen values and find complements in O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(); // value → index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // what we need to find

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // found the pair
            }

            map.put(nums[i], i); // store current value for future lookups
        }

        return new int[] { -1, -1 }; // no solution found
    }
}