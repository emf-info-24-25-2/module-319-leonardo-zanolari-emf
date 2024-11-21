public class echa {
    public static void main(String[] args) {
        int v1 = 2;
        int v2 = 6543;

        inverser(v1, v2);

    }

    public static void inverser(int v1, int v2) {

        System.out.println(v1);
        System.out.println(v2);
        int v3 = v1;
        v1 = v2;
        v2 = v3;
        System.out.println(v1);
        System.out.println(v2);

    }

}
