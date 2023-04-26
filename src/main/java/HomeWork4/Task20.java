package HomeWork4;

import java.util.Stack;

public class Task20 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> braces = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                braces.push(')');
            else if (c == '{')
                braces.push('}');
            else if (c == '[')
                braces.push(']');
            else if (braces.isEmpty() || braces.pop() != c)
                return false;
        }
        return true; //braces.isEmpty();
    }
}
