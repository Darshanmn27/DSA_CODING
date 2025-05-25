# Fizz Buzz in Java

## Description
This Java program implements the classic **Fizz Buzz** problem:
- Prints "Fizz" for numbers divisible by **3**.
- Prints "Buzz" for numbers divisible by **5**.
- Prints "FizzBuzz" for numbers divisible by **3 and 5**.
- Otherwise, prints the number itself.

## How to Run
1. Compile the Java file:
   ```Java
   import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 15; // Example input
        System.out.println(fizzBuzz(n));
    }
}
```
---
Time Complexity
The program runs a single loop from 1 to n, making O(n) iterations.

Each iteration takes O(1) time, as the conditions are simple modulus operations.

Overall time complexity: O(n)

Space Complexity
The program stores results in a list of strings, taking O(n) space.

Other than the list, constant space is used.

Overall space complexity: O(n)
