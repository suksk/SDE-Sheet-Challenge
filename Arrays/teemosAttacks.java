/**
 * Find the minimum between the "diference between consecutive times"
 * and "duration".
 * Add the minimum to the sum.
 * Return the sum along withe the duration.
 * Note the forloop test condition.
 */

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        if (duration == 0)
            return 0;

        for (int i = 0; i + 1 < timeSeries.length; i++) {
            sum += Math.min((timeSeries[i + 1] - timeSeries[i]), duration);
        }
        return (sum + duration);
    }
}
