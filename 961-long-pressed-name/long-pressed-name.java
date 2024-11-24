class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;

        while (j < typed.length()) {
            // If characters match in both name and typed, or if it's a valid long press (typed matches previous name char)
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;  // Move to the next character in name
            } else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                // If typed character matches the previous character in name, move to the next character in typed
            } else {
                // If neither condition is met, return false
                return false;
            }
            j++;  // Move to the next character in typed
        }

        // If we've matched all characters in name, return true
        return i == name.length();
    }
}
