// Input: n = 1
// Output: "1"
// Explanation: This is the base case.
// Example 2:

// Input: n = 4
// Output: "1211"
// Explanation:
// countAndSay(1) = "1"
// countAndSay(2) = say "1" = one 1 = "11"
// countAndSay(3) = say "11" = two 1's = "21"
// countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"

class Solution {
    public String countAndSay(int n) {
        String current = "1";
    for (int i = 2; i <= n; i++) {
        StringBuilder sb = new StringBuilder();
        char digit = current.charAt(0);
        int count = 1;
        for (int j = 1; j < current.length(); j++) {
            if (current.charAt(j) == digit) {
                count++;
            } else {
                sb.append(count);
                sb.append(digit);
                digit = current.charAt(j);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(digit);
        current = sb.toString();
    }
    return current;
    }
}
// The implementation uses a loop to compute the nth term of the count-and-say sequence. At each iteration, it generates the next term by "saying" the previous term.
// The current variable holds the previous term (initialized to "1" for the base case). The loop starts from i = 2 (since the base case is n = 1) and generates the next term by iterating through the characters of the current term.
// The StringBuilder sb is used to build the next term. The digit variable holds the current digit, and the count variable holds the number of times the digit appears in a row. The loop iterates through the characters of the current term and updates the digit and count variables as needed.
// Whenever the digit changes, the count and digit are appended to the StringBuilder, and the count is reset to 1. Once the loop completes, the final count and digit are appended to the StringBuilder, and the resulting string is assigned to current.
// Finally, the loop completes, and the final current value is returned, representing the nth term of the count-and-say sequence.
