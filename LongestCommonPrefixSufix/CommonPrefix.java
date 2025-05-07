public class CommonPrefix {
    public static void main(String darshan[]) {

        String arr[] = { "darshan", "darshanmn", "darshandeveloper", "darshancoder" };
        if (arr == null || arr.length == 0) {
            System.out.println("Input array is null or empty");
            return;
        }
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Null string found in array");
                return;

            }
            while (!arr[i].startsWith(prefix)) {
                if (prefix.isEmpty()) {
                    System.out.println("No common prefix ");
                    return;

                }
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }
}