class Solution {
    public int maxSubArray(int[] nums) {

        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum is less than 0, discard the sum
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxi;
    }
}
