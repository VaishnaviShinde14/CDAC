public class BalancedParentheses {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Mapping of closing to opening parentheses
        char[][] pairs = {{')', '('}, {']', '['}, {'}', '{'}};

        for (char c : expression.toCharArray()) {
            // Push opening parentheses onto stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // Check closing parentheses
            else if (c == ')' || c == ']' || c == '}') {
                // Stack empty or mismatched pair
                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();
                // Check pair match
                boolean match = false;
                for (char[] pair : pairs) {
                    if (c == pair[0] && opening == pair[1]) {
                        match = true;
                        break;
                    }
                }
                if (!match) {
                    return false;
                }
            }
        }

        // Balanced if stack is empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test Case 1
        String expression1 = "({[()]})";
        System.out.println(expression1 + ": " + (isBalanced(expression1) ? "Balanced" : "Not Balanced"));

        // Test Case 2
        String expression2 = "([)]";
        System.out.println(expression2 + ": " + (isBalanced(expression2) ? "Balanced" : "Not Balanced"));
    }
}
