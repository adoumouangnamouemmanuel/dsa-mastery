package leetcode.strings.easy;

import java.util.Set;
import java.util.HashSet;
/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

class LongestSubstringWithoutRepeatingCharacters {

    // Quick test: prints the length of the longest substring without repeating
    // characters
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbbmpactqeqwabc"));
    }

    /**
     * Approach: Sliding Window
     *
     * Use two pointers (left, right) to define a window over the string.
     * Expand the window to the right as long as the current character is unique.
     * When a duplicate is found, shrink the window from the left until it's gone.
     * Track the maximum window size seen at any point.
     *
     * Time Complexity: O(n) — each character is visited at most twice (once by
     * right, once by left)
     * Space Complexity: O(min(n, a)) — where a is the size of the character set
     * (e.g. 128 for ASCII)
     */
    public static int lengthOfLongestSubstring(String s) {
        int left = 0; // Left boundary of the sliding window
        int right = 0; // Right boundary of the sliding window
        int maxLength = 0; // Best (longest) window size found so far
        Set<Character> set = new HashSet<>(); // Characters currently inside the window

        // Expand the right pointer until it reaches the end of the string
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                // Current character is NOT in the window — safe to expand right
                set.add(s.charAt(right));
                right++;
                // Update the max window size: window size = right - left
                maxLength = Math.max(maxLength, right - left);
            } else {
                // Duplicate found — shrink the window from the left
                // until the duplicate character is removed
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}