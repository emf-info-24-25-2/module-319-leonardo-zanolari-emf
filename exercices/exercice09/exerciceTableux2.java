public class exerciceTableux2 {
    final int table = 10;

    public static void main(String[] args) {
        int[] tableux = new int[10];

        for (int l = 0; l < 10; l++) {
            int nombreAleatoire = 1 + (int) (Math.random() * ((6 - 1) + 1));
            tableux[l] = nombreAleatoire;
            System.out.println(tableux[l]);

        }

    }
}
