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
```

# 🚀 Java Program for Number System Conversions

## ✅ Problem Statement
This Java program demonstrates the conversion of numbers between different number systems: Decimal, Binary, Octal, and Hexadecimal. The program provides the following functionalities:
- Convert a decimal number to binary.
- Convert a decimal number to octal.
- Convert a decimal number to hexadecimal.
- Convert a binary number to decimal.
- Convert an octal number to decimal.

## 📊 Example Input & Output

| Conversion Type        | Input    | Output      |
|------------------------|----------|-------------|
| Decimal → Binary       | 27       | 1 1 0 1 1   |
| Decimal → Octal        | 10       | 1 2         |
| Decimal → Hexadecimal  | 10       | A           |
| Binary → Decimal       | "1010"   | 10          |
| Octal → Decimal        | "42"     | 34          |

## 💻 Approach

### 💡 Logic:
The program uses loops to repeatedly divide the number by the base (2, 8, 16 for binary, octal, and hexadecimal respectively), building the result string in reverse order. Additionally, for binary, octal, and hexadecimal, it uses modular arithmetic to extract remainders.

For conversions from Binary, Octal, and Hexadecimal to Decimal, the program uses the corresponding mathematical base (2, 8, 16).

## ✅ Code

```
public class Normal 
{
    
    // Decimal to Binary Conversion
    public  static void Dec_to_bin()
    {
        StringBuilder s=  new StringBuilder();
        int num=27;
        while (num>0) 
        {
            int r=num%2;
            s.insert(0, r+" ");
            num=num/2;
        }
        System.out.println("decimal to binary conversion is :");
        System.out.println(s.toString()); // Output: 1 1 0 1 1
    }
```

    ### Decimal to Octal Conversion
---

```
    public  static void Dec_to_octal()
    {
        StringBuilder s=  new StringBuilder();
        int num=10;
        while (num>0) 
        {
            int r=num%8;
            s.insert(0, r+" ");
            num=num/8;
        }
        System.out.println("decimal to octal conversion is :");
        System.out.println(s.toString()); // Output: 1 2
    }

```
    ---

    // Decimal to Hexadecimal Conversion
    public  static void decimal_to_hexadecimal()
    {
        System.out.println("decimal to hexadecimal:");
        int dec=10;
        StringBuilder ss=  new StringBuilder();
        while (dec>0) 
        {
            int r=dec%16;
            if(r<10)
            {
                ss.insert(0, (char)('0'+r));
            }
            else
            {
                ss.insert(0, (char)('A'+(r-10)));
            }
            dec=dec/16;
        }
        System.out.println(ss.toString()); // Output: A
    }

    // Binary to Decimal Conversion
    public  static void binary_to_decimal()
    {
        String bin="1010";
        int num=Integer.parseInt(bin);
        System.out.println(num);
        
        int res=0;
        int i=0;
        while (num>0) 
        {
            int r=num%10;
            res=res+r*(int)Math.pow(2, i);
            i++;
            num=num/10;  
        }
        System.out.println("binary to decimal number conversion is :");
        System.out.println(res); // Output: 10
    }

    // Octal to Decimal Conversion
    public  static void octal_to_decimal()
    {
        String bin="42";
        int num=Integer.parseInt(bin);
        System.out.println(num);
        
        int res=0;
        int i=0;
        while (num>0) 
        {
            int r=num%10;
            res=res+r*(int)Math.pow(8, i);
            i++;
            num=num/10;  
        }
        System.out.println("octal to decimal number conversion is :");
        System.out.println(res); // Output: 34
    }

    public static void main(String[] args) 
    {
        Dec_to_bin();
        Dec_to_octal();
        decimal_to_hexadecimal();
        binary_to_decimal();
        octal_to_decimal();
    }
}



