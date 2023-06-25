//1. Two Sum 
/**
 * We use hashmaps to store the numbers (keys) and
 * indices (values).
 * Find the difference between the current element
 * and the target value, search for the "difference"
 * number in the hashmap.
 * If present, return the two indices else,
 * add the key-value pair to the hashmap.
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> arrayOfInd = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (arrayOfInd.containsKey(target - nums[i]))
                return new int[] { arrayOfInd.get(target - nums[i]), i };

            arrayOfInd.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}