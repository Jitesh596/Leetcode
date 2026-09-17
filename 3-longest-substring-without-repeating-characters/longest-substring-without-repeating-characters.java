class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int l =0, r = 0;
        Set<Character> st = new HashSet<>();
        int res = Integer.MIN_VALUE;
        String ans = "";
        while (r < s.length()){
            if (!st.contains(s.charAt(r))){
                st.add(s.charAt(r));
                ans += s.charAt(r);
                int n = ans.length();
                res = Math.max(res, n);
                r++;
            }
            else {
                st.remove(ans.charAt(0));
                ans = ans.substring(1);
            }
        }
        return res;
    }
}