/**
 * Q-27. Remove Element
 * The code is simple and self explanatory
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int actual = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                continue;

            nums[actual] = nums[i];
            actual++;
        }
        return actual;
    }
}