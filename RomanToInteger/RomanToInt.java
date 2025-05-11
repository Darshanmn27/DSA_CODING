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
                return 0;// invalid character
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