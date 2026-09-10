class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int i = 0;
        int r = 0;
        int sum = 0;
        double res = Double.NEGATIVE_INFINITY;

        while (r < nums.length) {

            sum += nums[r];

            if (r - i + 1 > k) {
                sum -= nums[i];
                i++;
            }

            if (r - i + 1 == k) {
                res = Math.max(res, (double) sum / k);
            }

            r++;
        }

        return res;
    }
}