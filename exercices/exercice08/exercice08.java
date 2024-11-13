package exercice08;

public class exercice08 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int i = 1;
        for (int index = 0; index < 5; index++) {
            System.out.println(a);
            a += 1;
        }
        while (i == 5) {
            System.out.println(b);
            b += 1;
            i += 1;
        }
        i = 1;
        do {
            System.out.println(c);
            i += 1;

        } while (i == 5);

    }
}
