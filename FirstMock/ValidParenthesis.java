import java.util.Stack;

public class ValidParenthesis {
    public static boolean isvalid(String str) {
        if (str == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char arr[] = str.toCharArray();
        for (char ch : arr) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "()";
        String str2 = "()[]{}";
        System.out.println("checking the valid parenmthesis or  not ");
        System.out.println("Input: " + str1 + " -> Output: " + isvalid(str1)); // true
        System.out.println("Input: " + str2 + " -> Output: " + isvalid(str2)); // true
        System.out.println("common  test cases");
        String s1 = "()";// true
        String s2 = "()[]{}";// true
        String s3 = "(";// false
        String s4 = "([)]";// false
        String s5 = null;// false
        String s6 = "";
        System.out.println(isvalid(s1));
        System.out.println(isvalid(s2));
        System.out.println(isvalid(s3));
        System.out.println(isvalid(s4));
        System.out.println(isvalid(s5));
        System.out.println(isvalid(s6));

    }

}
