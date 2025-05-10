import java.util.Stack;

public class ValidParentheseSwitch {

    public static boolean isValid(String str) {
        if (str == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char arr[] = str.toCharArray();
        for (char ch : arr) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "([)]";
        System.out.println(isValid(s1));// true
        System.out.println(isValid(s2));// true
        System.out.println(isValid(s3));// false

    }

}
