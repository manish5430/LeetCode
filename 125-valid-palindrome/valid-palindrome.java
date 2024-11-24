class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}