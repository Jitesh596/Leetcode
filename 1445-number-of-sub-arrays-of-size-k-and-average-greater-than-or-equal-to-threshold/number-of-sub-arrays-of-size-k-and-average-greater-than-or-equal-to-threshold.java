class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int r = 0;
        int sum = 0;
        int res = 0;

        while (r < arr.length) {

            sum += arr[r];
            if (r - i + 1 > k) {
                sum -= arr[i];
                i++;
            }
            if (r - i + 1 == k) {
                if (sum >= k * threshold) {
                    res++;
                }
            }
            r++;
        }
        return res;
    }
}