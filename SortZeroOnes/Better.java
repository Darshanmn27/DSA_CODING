public class Better {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 2, 0, 0, 2, 1, 0, 2 };
        if (arr == null || arr.length == 0) {
            System.out.println("Array  is null  or empty.");
            return;
        }
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }
        int index = 0;

        while (count0 > 0) {
            arr[index++] = 0;
            count0--;
        }
        while (count1 > 0) {
            arr[index++] = 1;
            count1--;
        }
        while (count2 > 0) {
            arr[index++] = 2;
            count2--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
