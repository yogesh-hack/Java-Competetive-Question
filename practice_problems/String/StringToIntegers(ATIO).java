// problem : 8

// Input: s = "42"
// Output: 42
// Explanation: The underlined characters are what is read in, the caret is the current reader position.
// Step 1: "42" (no characters read because there is no leading whitespace)
//          ^
// Step 2: "42" (no characters read because there is neither a '-' nor '+')
//          ^
// Step 3: "42" ("42" is read in)
//            ^
// The parsed integer is 42.
// Since 42 is in the range [-231, 231 - 1], the final result is 42.
  
//  Time Complexity: O(N)
//  Space Complexity: O(1)
   
class Solution {
    public int myAtoi(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string is null");
        }

        int len = s.length();
        if (len == 0) {
            return 0;
        }

        int idx = 0;

        // Ignoring the leading whitespace
        while (idx < len && s.charAt(idx) == ' ') {
            idx++;
        }
        if (idx == len) {
            return 0;
        }

        // Checking for sign
        int sign = 1;
        char c = s.charAt(idx);
        if (c == '-' || c == '+') {
            if (c == '-') {
                sign = -1;
            }
            idx++;
        }

        int result = 0;

        while (idx < len && Character.isDigit(s.charAt(idx))) {
            int digit = s.charAt(idx) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10
                    // Here Checking for sign is not required as for Int.MIN last digit is 8 which
                    // is greater than 7.
                    && digit > Integer.MAX_VALUE % 10)) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + digit;
            idx++;
        }

        return sign * result;
    }
}
