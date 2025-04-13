# 🔢 Numbers Utility Program in Java

This Java program is a collection of fundamental number operations that are frequently asked in interviews and coding assessments. It includes functionalities like reversing a number, checking for palindromes and Armstrong numbers, generating a range of Armstrong numbers, computing LCM and HCF, and calculating the factorial of a number.

---

## 📌 Features Implemented

- ✅ **Reverse a Number**
- ✅ **Palindrome Number Check**
- ✅ **Armstrong Number Check**
- ✅ **Print Armstrong Numbers in a Range**
- ✅ **LCM and HCF Calculation**
- ✅ **Factorial of a Number**

---

## 🧠 Concepts Used

- Control Structures (`for`, `while`, `if-else`)
- Type Casting and Math.pow()
- Number Theory Logic
- Method Decomposition for Modular Code

---

## 📂 Code Structure

```java
public class Numbers {

    // 1. Reverse a number
    public static void reverse_number() {
        int num = 2027;
        int rev = 0;
        while (num > 0) {
            int r = num % 10;      // extract last digit
            rev = rev * 10 + r;    // build reversed number
            num = num / 10;        // remove last digit
        }
        System.out.println("Reversed number is: " + rev); // Output: 7202
    }

    // 2. Check for palindrome number
    public static void palindrome_number() {
        System.out.println("Checking palindrome for number: 1221");
        int num = 1221;
        int rev = 0;
        int temp = num;
        while (num > 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        if (rev == temp) {
            System.out.println("Given number is a palindrome.");
        } else {
            System.out.println("Not a palindrome number.");
        }
    }

    // 3. Check if a number is an Armstrong number
    public static boolean check_armstrong_number(int num) {
        int temp = num;
        int arm = 0;
        int count = 0;

        // count number of digits
        while (num > 0) {
            count++;
            num = num / 10;
        }

        num = temp;
        while (num > 0) {
            int r = num % 10;
            arm = arm + (int)Math.pow(r, count); // raise digit to power of count
            num = num / 10;
        }

        return arm == temp;
    }

    // 4. Print all Armstrong numbers in range 1 to 1000
    public static void rangeofarmstrongnumber() {
        System.out.println("Armstrong numbers in range 1 to 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (check_armstrong_number(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 5. Calculate LCM and HCF of two numbers
    public static void lcm_hcf() {
        int num1 = 12;
        int num2 = 18;
        int hcf = 1;

        // calculate HCF
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        // calculate LCM using formula
        int lcm = (num1 * num2) / hcf;

        System.out.println("LCM is: " + lcm);  // Output: 36
        System.out.println("HCF is: " + hcf);  // Output: 6
    }

    // 6. Calculate factorial of a number
    public static void factorial() {
        int num = 4;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact); // Output: 24
    }

    // Main method to run all operations
    public static void main(String[] args) {
        reverse_number();
        palindrome_number();
        check_armstrong_number(2027); // This call won't print output; handled in range method
        rangeofarmstrongnumber();
        lcm_hcf();
        factorial();
    }
}
