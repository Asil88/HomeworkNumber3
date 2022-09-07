public class Task12 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int fi;

        for (int i = 0; i <= 11; i++) {
            fi = b;
            b = a + b;
            a = fi;

            System.out.println(fi);


        }
    }
}
