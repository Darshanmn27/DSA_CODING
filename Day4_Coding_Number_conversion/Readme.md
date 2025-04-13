🚀 Java Program for Number System Conversions using Inbuilt Methods
✅ Problem Statement
You are given a decimal number, and your task is to convert it into different number systems like Binary, Octal, and Hexadecimal using Java’s inbuilt methods. You also need to perform reverse conversions from Binary, Octal, and Hexadecimal to Decimal and demonstrate how prefixes like 0b, 0, 0x work in Java.

📊 Example Input & Output
Conversion Type	Input	Output
Decimal → Binary	10	1010
Decimal → Octal	10	12
Decimal → Hexadecimal	10	a
Binary → Decimal	"1010"	10
Octal → Decimal	"15"	13
Hexadecimal → Decimal	"A"	10
💻 Approach
💡 Logic:
We use inbuilt methods from the Integer class:

toBinaryString()

toOctalString()

toHexString()

parseInt(String s, base)

Additionally, demonstrate how Java reads literal numbers with binary (0b), octal (0), and hexadecimal (0x) prefixes.

✅ Code
import java.util.*;

public class NumberSystemConversion {

    // Decimal to Binary
    public static void decimalToBinary(int num) {
        String binary = Integer.toBinaryString(num);
        System.out.println("Decimal to Binary: " + binary);
    }

    // Decimal to Octal
    public static void decimalToOctal(int num) {
        String octal = Integer.toOctalString(num);
        System.out.println("Decimal to Octal: " + octal);
    }

    // Decimal to Hexadecimal
    public static void decimalToHexadecimal(int num) {
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
    public static void usingPrefixes() {
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

    public static void main(String[] args) {
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
