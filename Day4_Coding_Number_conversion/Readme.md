
# 🚀 Java Program for Number System Conversions using Inbuilt Methods

## ✅ Problem Statement
You are given a decimal number, and your task is to convert it into different number systems like Binary, Octal, and Hexadecimal using Java’s inbuilt methods. You also need to perform reverse conversions from Binary, Octal, and Hexadecimal to Decimal and demonstrate how prefixes like `0b`, `0`, `0x` work in Java.

## 📊 Example Input & Output

| Conversion Type        | Input    | Output |
|------------------------|----------|--------|
| Decimal → Binary       | 10       | 1010   |
| Decimal → Octal        | 10       | 12     |
| Decimal → Hexadecimal  | 10       | a      |
| Binary → Decimal       | "1010"   | 10     |
| Octal → Decimal        | "15"     | 13     |
| Hexadecimal → Decimal  | "A"      | 10     |

## 💻 Approach

### 💡 Logic:
We use inbuilt methods from the `Integer` class:

- `toBinaryString()`
- `toOctalString()`
- `toHexString()`
- `parseInt(String s, base)`

Additionally, demonstrate how Java reads literal numbers with binary (`0b`), octal (`0`), and hexadecimal (`0x`) prefixes.

## ✅ Code

```java
import java.util.*;

public class NumberSystemConversion 
{

    // Decimal to Binary
    public static void decimalToBinary(int num) 
    {
        String binary = Integer.toBinaryString(num);
        System.out.println("Decimal to Binary: " + binary);
    }

    // Decimal to Octal
    public static void decimalToOctal(int num) {
        String octal = Integer.toOctalString(num);
        System.out.println("Decimal to Octal: " + octal);
    }

    // Decimal to Hexadecimal
    public static void decimalToHexadecimal(int num) 
    {
        String hex = Integer.toHexString(num);
        System.out.println("Decimal to Hexadecimal: " + hex);
    }

    // Binary to Decimal
    public static void binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal: " + decimal);
    }

    // Octal to Decimal
    public static void octalToDecimal(String octal) {
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Octal to Decimal: " + decimal);
    }

    // Hexadecimal to Decimal
    public static void hexadecimalToDecimal(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Hexadecimal to Decimal: " + decimal);
    }

    // Demonstrating usage of Prefix Literals
    public static void usingPrefixes() 
    {
        System.out.println("Using Java Literals with Prefixes:");

        int decimal = 918171; // No prefix = Decimal
        System.out.println("Decimal (no prefix): " + decimal);

        int hex = 0x91; // Hexadecimal
        System.out.println("0x91 (Hexadecimal): " + hex);

        int binary = 0b1010; // Binary
        System.out.println("0b1010 (Binary): " + binary);

        int octal = 071; // Octal
        System.out.println("071 (Octal): " + octal);
    }

    public static void main(String[] args)
    {
        int number = 10;

        System.out.println("==> Decimal to Other Conversions:");
        decimalToBinary(number);
        decimalToOctal(number);
        decimalToHexadecimal(number);

        System.out.println("\n==> Other to Decimal Conversions:");
        binaryToDecimal("1010");
        octalToDecimal("15");
        hexadecimalToDecimal("A");

        System.out.println("\n==> Prefix Literals in Java:");
        usingPrefixes();
    }
}



✅ Output
==> Decimal to Other Conversions:
Decimal to Binary: 1010
Decimal to Octal: 12
Decimal to Hexadecimal: a

==> Other to Decimal Conversions:
Binary to Decimal: 10
Octal to Decimal: 13
Hexadecimal to Decimal: 10

==> Prefix Literals in Java:
Using Java Literals with Prefixes:
Decimal (no prefix): 918171
0x91 (Hexadecimal): 145
0b1010 (Binary): 10
071 (Octal): 57


✅ Time & Space Complexity
Operation	Time Complexity	Space Complexity
Each Conversion	O(1)	O(1)
Total Program	O(1)	O(1)
💎 Summary
Conversion Type	Method Used
Decimal → Binary	Integer.toBinaryString()
Decimal → Octal	Integer.toOctalString()
Decimal → Hexadecimal	Integer.toHexString()
Binary → Decimal	Integer.parseInt(s, 2)
Octal → Decimal	Integer.parseInt(s, 8)
Hex → Decimal	Integer.parseInt(s, 16)
🧠 Methods Explained One by One
1️⃣ decimalToBinary()
Purpose: Convert a decimal number (e.g., 27) to binary.

Logic: Divide the number by 2 repeatedly. Store the remainder at each step. Insert the remainders in reverse order using StringBuilder.

Example Output: decimal to binary conversion is: 1 1 0 1 1

2️⃣ decimalToOctal()
Purpose: Convert a decimal number (e.g., 10) to octal.

Logic: Divide the number by 8 repeatedly. Store remainders and reverse them using StringBuilder.

Example Output: decimal to octal conversion is: 1 2

3️⃣ decimalToHexadecimal()
Purpose: Convert a decimal number (e.g., 10) to hexadecimal.

Logic: Divide the number by 16 repeatedly. For remainders >= 10, map them to A-F. Insert characters in reverse using StringBuilder.

Example Output: decimal to hexadecimal: A

4️⃣ binaryToDecimal()
Purpose: Convert a binary number (e.g., 1010) to decimal.

Logic: Read binary as a string ("1010"). Convert string to integer. Use modulus and power of 2 to compute decimal.

Example Output: binary to decimal number conversion is: 10

5️⃣ octalToDecimal()
Purpose: Convert an octal number (e.g., 42) to decimal.

Logic: Read octal as a string ("42"). Convert string to integer. Use modulus and power of 8 to compute decimal.

Example Output: octal to decimal number conversion is: 34

✅ Highlights
Uses Java’s inbuilt methods (Integer.toBinaryString(), Integer.toOctalString(), Integer.toHexString(), Integer.parseInt()).

Demonstrates how Java handles number system prefixes (0b, 0, 0x).



//next phase 


💎 Summary
Conversion Type	Method Used
Decimal → Binary	Integer.toBinaryString()
Decimal → Octal	Integer.toOctalString()
Decimal → Hexadecimal	Integer.toHexString()
Binary → Decimal	Integer.parseInt(s, 2)
Octal → Decimal	Integer.parseInt(s, 8)
Hex → Decimal	Integer.parseInt(s, 16)

🧠 Methods Explained One by One
1️⃣ decimalToBinary()
Purpose:
Convert a decimal number (e.g., 27) to binary.

Logic:

Divide the number by 2 repeatedly.

Store the remainder at each step.

Insert the remainders in reverse order using StringBuilder.

int num = 27;
while (num > 0) {
    int r = num % 2;
    s.insert(0, r + " ");
    num = num / 2;
}
Output:

decimal to binary conversion is : 1 1 0 1 1


2️⃣ decimalToOctal()
Purpose:
Convert a decimal number (e.g., 10) to octal.

Logic:

Divide the number by 8 repeatedly.

Store remainders and reverse them using StringBuilder.

java

int num = 10;
while (num > 0) {
    int r = num % 8;
    s.insert(0, r + " ");
    num = num / 8;
}
Output:

decimal to octal conversion is : 1 2
3️⃣ decimalToHexadecimal()
Purpose:
Convert a decimal number (e.g., 10) to hexadecimal.

Logic:

Divide the number by 16 repeatedly.

For remainders >= 10, map them to A-F.

Insert characters in reverse using StringBuilder.

java
Copy
Edit
int dec = 10;
int r = dec % 16;
if (r < 10)
    ss.insert(0, (char)('0' + r));
else
    ss.insert(0, (char)('A' + (r - 10)));
Output:

vbnet
Copy
Edit
decimal to hexadecimal: A
4️⃣ binaryToDecimal()
Purpose:
Convert a binary number (e.g., 1010) to decimal.

Logic:

Read binary as a string ("1010").

Convert string to integer.

Use modulus and power of 2 to compute decimal.

java
Copy
Edit
int res = 0, i = 0;
while (num > 0) {
    int r = num % 10;
    res += r * Math.pow(2, i++);
    num /= 10;
}
Output:
binary to decimal number conversion is: 10

5️⃣ octalToDecimal()
Purpose:
Convert an octal number (e.g., 42) to decimal.

Logic:

Read octal as a string ("42").

###Convert string to integer.

###Use modulus and power of 8 to compute decimal.

int res = 0, i = 0;
while (num > 0) {
    int r = num % 10;
    res += r * Math.pow(8, i++);
    num /= 10;
}
Output:
octal to decimal number conversion is: 34

✅ Highlights
Uses Java’s inbuilt methods (Integer.toBinaryString(), Integer.toOctalString(), Integer.toHexString(), Integer.parseInt()).

Demonstrates how Java handles number system prefixes (0b, 0, 0x).
