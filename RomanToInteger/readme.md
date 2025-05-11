# Roman to Integer Converter

## Overview

This Java program converts a Roman numeral string to its equivalent integer value. It handles edge cases, invalid inputs, and outputs the corresponding integer for a valid Roman numeral string. The program uses a map to store the Roman numerals and their corresponding integer values and processes the string from right to left to calculate the integer.

## Features

- Converts Roman numerals such as `III`, `IV`, `IX`, `MCMXCIV`, etc., into integers.
- Handles invalid inputs such as null, empty strings, or characters that are not Roman numerals.
- Prints an error message for invalid characters.

## Roman Numerals Supported

The program supports the following Roman numerals:
- `I` -> 1
- `V` -> 5
- `X` -> 10
- `L` -> 50
- `C` -> 100
- `D` -> 500
- `M` -> 1000

## Approach

The program uses a **HashMap** to map Roman numeral characters to their respective integer values. The logic works by iterating through the input string from right to left:

1. **Initialization**:
   - If the input is `null` or empty, it returns `0`.
   - A map (`hh`) is created to store the values for Roman numerals.

2. **Iterating Through the String**:
   - It iterates through the Roman numeral string from right to left, using the Roman numeral character as a key to fetch the corresponding value from the map.
   - If a character is invalid (not a valid Roman numeral), it prints an error message and returns `0`.
   - The integer values are added or subtracted based on whether the current value is greater than or smaller than the previous value encountered in the string.

3. **Result Calculation**:
   - If the current Roman numeral is less than the previous one (like `IV` or `IX`), it's subtracted from the total.
   - Otherwise, it's added to the total.

4. **Return**:
   - The program finally returns the calculated integer value for the given Roman numeral string.

## Code Implementation

```java
import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Invalid Input : null  or  empty string. ");
            return 0;
        }
        Map<Character, Integer> hh = new HashMap<>();
        hh.put('I', 1);
        hh.put('V', 5);
        hh.put('X', 10);
        hh.put('L', 50);
        hh.put('C', 100);
        hh.put('D', 500);
        hh.put('M', 1000);
        int total = 0;
        int pre = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int curvalue = hh.getOrDefault(ch, -1);
            if (curvalue == -1) {
                System.out.println("Invalid Roman numeral character: " + ch);
                return 0; // invalid character
            }
            if (curvalue < pre) {
                total = total - curvalue;
            } else {
                total = total + curvalue;
            }
            pre = curvalue;
        }
        return total;
    }

    public static void main(String[] ZenShan) {
        String testcases[] = { "III", "IV", "IX", "LVIII", "MCMXCIV", "", null, "ABC" };
        for (String roman : testcases) {
            System.out.println("Roman " + roman + " -> Integer :" + romanToInt(roman));
        }
    }
}
```
---
---
### Time Complexity: O(n), where n is the length of the input string.
---
### Space Complexity: O(1) (constant space).

