import java.util.*;

public class numberToWords {
    public static void main(String[] darshan) {
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

        System.out.println(res.trim()); // two thousand twenty seven
    }

}