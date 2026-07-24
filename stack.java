import java.util.*;
class Main {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression : ");
        String expression = sc.nextLine();

        if (isBalanced(expression)) {
            System.out.println("The string has balanced parentheses.");
        } else {
            System.out.println("The string does not have balanced parentheses.");
        }
    }
}