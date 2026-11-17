
class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 65 && ch <= 90) {
                str.append((char)(ch + 32));
            }

            if ((ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57)) {
                str.append(ch);
            }
        }

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
