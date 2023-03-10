// Problem : 1678

// Input: command = "G()(al)"
// Output: "Goal"
// Explanation: The Goal Parser interprets the command as follows:
// G -> G
// () -> o
// (al) -> al
// The final concatenated result is "Goal".


class Solution {
    public String interpret(String command) {

        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    sb.append("o");
                    i++; // ")"
                }
                else{
                    sb.append("al");
                    i=i+3; // "al)"
                }
            }
        }
        return sb.toString();
    }
}
