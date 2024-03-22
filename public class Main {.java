public class Main {
    
}
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesesChecker {
    
    public static boolean checkBalancedParentheses(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Unbalanced expression
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false; // Unbalanced expression
                }
            }
        }
        
        return stack.isEmpty(); // Returns true if stack is empty (balanced expression)
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an expression made up of only '(', ')', '{', '}', '[', ']':");
        String expression = scanner.nextLine();
        
        if (checkBalancedParentheses(expression)) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
        
        scanner.close();
    }
}
