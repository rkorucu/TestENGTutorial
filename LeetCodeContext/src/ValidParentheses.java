import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char strt = s.charAt(i);
            if (strt == '(' || strt == '[' || strt == '{') {
                stack.push(strt);
            } else if (stack.empty()) {
                return false;
            } else if (strt == ')' && stack.pop() != '(') {
                return false;
            } else if (strt == ']' && stack.pop() != '[') {
                return false;
            } else if (strt == '}' && stack.pop() != '{') {
                return false;

            }

        }
        return stack.empty();
    }
}