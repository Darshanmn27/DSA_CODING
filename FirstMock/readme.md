# Valid Parenthesis Checker

This Java program validates whether a string containing various types of parentheses (`()`, `{}`, `[]`) is valid. The string is considered valid if the parentheses are properly balanced and each opening parenthesis has a corresponding closing parenthesis in the correct order.

## Problem Description

Given a string consisting of characters such as `()`, `{}`, and `[]`, determine if the string is valid. A string is valid if:
- Open parentheses must be closed by the corresponding parentheses.
- Open parentheses must be closed in the correct order.

For example:
- `"()"` is valid.
- `"()[]{}"` is valid.
- `"(]"` is invalid.
- `"([)]"` is invalid.
- `"("` is invalid.


---
---
## Features
- **Switch-Case Based Solution**: A clean and efficient way to match parentheses using `switch` cases.
- **Stack Data Structure**: Utilizes a stack to keep track of the opening parentheses.

## Code Overview

### Method: `isvalid(String str)`
- The method accepts a string `str` containing parentheses and checks whether it is valid.
- It uses a stack to track the opening parentheses and matches them with closing ones.
- If the string is null or any unmatched parentheses are found, the method returns `false`. If the string is valid, it returns `true`.

### Method: `isValid(String str)` (Switch-Case Version)
- This is an alternate implementation using `switch` to check the validity of the parentheses.
- It uses the same stack approach but handles each parenthesis type with a `switch` statement for clarity.

### Main Method
The `main()` method provides sample input strings and prints the result of checking each string's validity.

## Sample Test Cases

1. **Test Case 1:**
   - **Input**: `"()"`
   - **Expected Output**: `true`
   
2. **Test Case 2:**
   - **Input**: `"()[]{}"`
   - **Expected Output**: `true`
   
3. **Test Case 3:**
   - **Input**: `"("`
   - **Expected Output**: `false`
   
4. **Test Case 4:**
   - **Input**: `"([)]"`
   - **Expected Output**: `false`
   
5. **Test Case 5:**
   - **Input**: `null`
   - **Expected Output**: `false`
   
6. **Test Case 6:**
   - **Input**: `""`
   - **Expected Output**: `true`

## Time Complexity

- **Time Complexity**: O(n), where `n` is the length of the input string.
  - The method iterates through each character in the string once and performs constant-time operations (push, pop, check) for each character.

## Space Complexity

- **Space Complexity**: O(n), where `n` is the length of the input string.
  - The stack stores up to `n/2` characters in the worst case (e.g., if the input contains only opening parentheses).

## Conclusion

This solution efficiently checks whether a string of parentheses is valid using a stack data structure. The time complexity is linear, and the space complexity is proportional to the length of the string. The program is simple, intuitive, and works for various edge cases like empty strings or null inputs.

---
```java
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
```
---
```
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
```