/**
 * The first condition keeps the array from going out of bounds.
 * The loop skips when there are adjacent duplicates.
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int actual = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1])
                continue;

            nums[actual] = nums[i];
            actual++;
        }
        return actual;
    }
}