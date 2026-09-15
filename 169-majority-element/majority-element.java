class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        int res = Integer.MIN_VALUE;

        for (int x : nums) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            if (x.getValue() > res) {
                res = x.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            if (x.getValue() == res) {
                return x.getKey();
            }
        }

        return 0;
    }
}