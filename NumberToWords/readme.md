# Number to Words Converter in Java

This is a simple Java program that converts an integer number (from 0 to 9999) into its English words representation.

---

## Features

- Converts numbers from **0** to **9999** into words.
- Handles units, tens, teens, hundreds, and thousands places.
- Prints the English words equivalent of the given number.
- Example: `2027` → `"two thousand twenty seven"`

---

## How It Works

1. Checks if the number is zero, then prints `"zero"`.
2. Uses string arrays for units (1-9), teens (11-19), and tens (10, 20, 30,...).
3. Extracts thousands, hundreds, tens, and units place values.
4. Concatenates corresponding word strings for each place value.
5. Prints the final result trimmed of extra spaces.

---

## Code Example

```java
import java.util.*;

public class numberToWords {
    public static void main(String[] args) {
        int num = 2027;
        if (num == 0) {
            System.out.println("zero");
            return;
        }
        String units[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String teens[] = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String tens[] = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety" };
        String res = "";

        if (num / 1000 > 0) {
            res = res + units[num / 1000] + " thousand ";
            num = num % 1000;
        }
        if (num / 100 > 0) {
            res = res + units[num / 100] + " hundred ";
            num = num % 100;
        }
        if (num > 0) {
            if (num == 10) {
                res = res + "ten ";
            } else if (num >= 11 && num <= 19) {
                res = res + teens[num - 11] + " ";
            } else {
                res = res + tens[num / 10] + " ";
                res = res + units[num % 10] + " ";
            }
        }

        System.out.println(res.trim()); // Output: two thousand twenty seven
    }
}
```


---
### time complexity
O(1)

---
### space   complexity 
O(1)
---
