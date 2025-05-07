public class CommonSuffix {

    public static void main(String[] args) {

        String arr[] = { "darshan2027", "darshanmn2027", "darshandeveloper2027", "darshancoder2027" };
        if (arr == null || arr.length == 0) {
            System.out.println("Input array is null or empty");
            return;
        }
        String suffix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Null string found in array");
                return;

            }
            while (!arr[i].endsWith(suffix)) {
                if (suffix.isEmpty()) {
                    System.out.println("no common suffix ");
                    return;

                }
                suffix = suffix.substring(1);
            }
        }
        System.out.println(suffix);
    }

}
