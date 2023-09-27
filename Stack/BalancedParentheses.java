import java.util.Stack;

public class BalancedParentheses {
    public static boolean areParenthesesBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Closing parenthesis without matching opening parenthesis
                }
                System.out.println(stack);
                char top = stack.pop();
                System.out.println("Stack bracket : "+top+" "+ch);
            if (!areMatching(top, ch)) {
                return false; // Mismatched opening and closing parenthesis
                }
            }
        }

        return stack.isEmpty(); // If the stack is empty, all parentheses are balanced
    }

    private static boolean areMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String str = "{(a+b)*c}";
        String str2 = "((a+b*c)";
        if (areParenthesesBalanced(str2)) {
            System.out.println("\nParentheses Balanced");
        } else {
            System.out.println("\nParentheses Not Balanced");
        }
    }
}
