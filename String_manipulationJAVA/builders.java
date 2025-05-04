public class builders {

    public static void manipulate1() {
        System.out.println("builder manipulation");
        StringBuilder st = new StringBuilder();
        System.out.println(st.capacity());// 16
        st.append("darshan");// adds 7 characters
        System.out.println(st);// darshan
        st.append("good morning ");// adds 13 characters ==> total 20 characters
        System.out.println(st);// darshangood morning
        System.out.println(st.capacity());// 34
        st.delete(0, 7);// deletes characters from index 0 to 6 ("darshan")
        System.out.println(st);// good morning
    }

    public static void main(String[] args) {

        manipulate1();
    }

}
