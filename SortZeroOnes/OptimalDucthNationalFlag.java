import java.util.ArrayList;
import java.util.Arrays;

public class OptimalDucthNationalFlag {

    public static void sortedarry(ArrayList<Integer> aa, int n) {
        int low = 0, mid = 0, high = n - 1;// 3 pointers
        while (mid <= high) {
            if (aa.get(mid) == 0) {
                int temp = aa.get(low);
                aa.set(low, aa.get(mid));
                aa.set(mid, temp);
                low++;
                mid++;
            } else if (aa.get(mid) == 1) {
                mid++;
            } else {
                int temp = aa.get(mid);
                aa.set(mid, aa.get(high));
                aa.set(high, temp);
                high--;
            }

        }

    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> aa = new ArrayList<>(Arrays.asList(new Integer[] { 0, 2, 1, 2, 0, 1 }));
        sortedarry(aa, n);
        System.out.println("after sorting ");
        for (int num : aa) {
            System.out.print(num + " ");
        }

    }

}
