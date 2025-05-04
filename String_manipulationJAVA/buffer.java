public class buffer {

    public static void simplebuffer() {
        // chengable string
        StringBuffer st = new StringBuffer();
        System.out.println(st.capacity());// 16 default capacity
        st.append("darshan");
        System.out.println(st);// darshan
        st.append("welcome");
        System.out.println(st);// darshanwelcome
        st.append("gosling");
        System.out.println(st);// darshanwelcomegosling
        System.out.println(st.capacity());// 34
        // capacity==> current_capacity*2+2= 16*2+2=34 // it only grows when needed.
        st.delete(0, 7);// Deletes characters from index 0 to 6
        System.out.println(st);// welcomegosling
    }

    public static void main(String[] args) {
        simplebuffer();// 16

    }

}
