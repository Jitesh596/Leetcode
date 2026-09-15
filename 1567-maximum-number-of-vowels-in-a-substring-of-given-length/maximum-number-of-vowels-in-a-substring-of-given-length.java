class Solution {
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int res = Integer.MIN_VALUE;
        int count = 0;
        int l = 0, r = 0;
        while (r < s.length()) {
            if (isVowel(s.charAt(r))) {
                count++;
            }
            if (r - l + 1 > k) {
                if (isVowel(s.charAt(l))) {
                    count--;
                }
                l++;
            }
            if (r - l + 1 == k) {
                res = Math.max(res, count);
            }
            r++;
        }
        return res;
    }
}