public class Pattern1 {

    public static void Righthalf() {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pat2() {
        System.out.println("pattern 2:");
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void pat3() {
        System.out.println("pattern 3:");
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Righthalf();
        pat2();
        pat3();

    }
}