package twentyFour;

import java.util.Stack;

public class IsValidParenthesesStack {
    public boolean isValid(String s) {
        // Naively we can loop through for each type of parentheses and see if we can find its match
        // However we could just keep track of all types in one iteration with a Stack, since order matters
        // There are probably short circuit opportunities like if the sum of positive numbers exceeds the s.length()/2

        Stack<Character> stack = new Stack<Character>(); // create an empty stack

        for (char ch: s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }


        return stack.isEmpty();
    }
}
