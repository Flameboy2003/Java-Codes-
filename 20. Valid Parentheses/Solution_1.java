import java.util.Stack;

public class Solution {
    /**
     * This method checks if a given string of parentheses is valid.
     * A valid string has properly matched pairs of opening and closing brackets.
     *
     * @param s the input string consisting of characters '(', ')', '{', '}', '[' and ']'
     * @return true if the string is valid, false otherwise
     */
    public boolean isValid(String s) {
        // Initialize a stack to store opening brackets
        Stack<Character> st = new Stack<>();

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is an opening bracket, push it onto the stack
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else {
                // If the stack is empty (no opening bracket to match with), return false
                if (st.isEmpty()) return false;

                // If the character is a closing bracket, check if it matches the top of the stack
                else if (ch == '}') {
                    // If the top of the stack is '{', pop it; otherwise, return false
                    if (st.peek() == '{') {
                        st.pop();
                    } else return false;
                } else if (ch == ')') {
                    // If the top of the stack is '(', pop it; otherwise, return false
                    if (st.peek() == '(') {
                        st.pop();
                    } else return false;
                } else if (ch == ']') {
                    // If the top of the stack is '[', pop it; otherwise, return false
                    if (st.peek() == '[') {
                        st.pop();
                    } else return false;
                }
            }
        }

        // After processing all characters, if the stack is empty, return true (valid string)
        // If there are still unmatched opening brackets, return false
        return st.isEmpty();
    }
}
