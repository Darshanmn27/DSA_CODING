public class convertToTitle {
    public static void conversion(int columnnumber) {
        StringBuilder sb = new StringBuilder();
        while (columnnumber > 0) {
            columnnumber--;
            char c = (char) ('A' + (columnnumber % 26));
            sb.append(c);
            columnnumber /= 26;
        }
        System.out.println(sb.reverse().toString());
    }

    public static void main(String[] args) {
        conversion(2027);// BYY

    }

}
