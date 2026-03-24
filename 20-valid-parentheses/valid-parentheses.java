import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            // push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            // handle closing brackets
            else {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}