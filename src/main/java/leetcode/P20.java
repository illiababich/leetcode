package leetcode;

import java.util.Stack;

public class P20 {
    public static boolean isValid(String s) {
        int length = s.length();
        if (length < 2 || (length % 2 != 0)) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            char iteration = s.charAt(i);

            if (iteration == '(' || iteration == '{' || iteration == '[') {
                stack.push(iteration);
            } else {
                if (stack.isEmpty()) {
                    stack.push(iteration);
                    continue;
                }

                char reversedBracket = 0;
                if (iteration == ')') {
                    reversedBracket = (char) (iteration - 1); // '('
                } else if (iteration == '}' || iteration == ']') {
                    reversedBracket = (char) (iteration - 2); // '{' or '['
                }

                if (stack.peek() != reversedBracket) {
                    stack.push(iteration);
                } else {
                    stack.pop();
                }
            }
        }

        return stack.size() == 0;
    }
}
