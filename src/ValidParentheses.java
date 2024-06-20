import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (! stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            } else
                return false;
        }
        return stack.isEmpty(); // 如果栈为空，说明所有括号都已匹
    }
}
