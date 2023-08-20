/*
 * Problem: Candy Distribution
 * Given an array 'ratings' representing the ratings of children, where higher ratings should receive more candies
 * and each child must have at least one candy. Determine the minimum candies that need to be distributed.
 *
 * Approach:
 * 1. We create two arrays 'left' and 'right' to store the count of candies each child should receive from left and right sides.
 * 2. Initially, we set all elements of 'left' and 'right' arrays to 1, as each child must have at least one candy.
 * 3. We iterate through the 'ratings' array from left to right and update the 'left' array based on increasing ratings.
 * 4. We then iterate through the 'ratings' array from right to left and update the 'right' array based on increasing ratings.
 * 5. After calculating both 'left' and 'right' arrays, we iterate through the array and calculate the maximum candies each child should receive.
 * 6. The total minimum candies required will be the sum of the maximum candies from both 'left' and 'right' arrays for each child.
 *
 * Note: While this approach works for most cases, there can be situations where simultaneously checking both 'left' and 'right' fails to distribute
 * the candies optimally, leading to extra candies being given. This can happen when the ratings form a pattern like [1, 2, 1, 2, 1, 2].
 *
 * Test Case:
 * Input: ratings = [1, 2, 1, 2, 1, 2]
 * Output: 10
 *
 */

import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int[] left = new int[ratings.length + 1];
        Arrays.fill(left, 1);
        int[] right = new int[ratings.length + 1];
        Arrays.fill(right, 1);
        
        // Updating 'left' array
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        
        // Updating 'right' array
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }
        
        int minCandy = 0;
        for (int i = 0; i < ratings.length; i++) {
            minCandy += Math.max(left[i], right[i]);
        }
        
        return minCandy;
    }
}
