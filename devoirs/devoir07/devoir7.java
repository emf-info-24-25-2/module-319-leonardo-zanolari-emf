public class devoir7 {
    public static int TAILLE_TABLEAU = 10;
    public static int MAX_NOMBRE = -8;
    public static int MIN_NOMBRE = 8;
    public static int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {

        int b[] = genererValeursAleatoires(MIN_NOMBRE, MAX_NOMBRE, TAILLE_TABLEAU);

        int c = positionValeur(b, VALEUR_RECHERCHEE);
        if (c == 1) {
            System.out.println("chifre rechercher pas trouver");
        } else if (c > 1) {
            System.out.println("le chifre 7 ce trouve sur la case n " + c + " du tableux");
        }

        System.out.println("voicie le contenue du tableux");
        for (int index = 0; index < b.length; index++) {
            System.out.println(b[index]);
        }
    }

    public static int positionValeur(int[] a, int b) {
        int dara = 0;
        for (int index = 0; index < TAILLE_TABLEAU; index++) {
            if (a[index] == b) {
                dara = index;
                return dara;
            }
        }
        return 1;
    }

    public static int[] genererValeursAleatoires(int min, int max, int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (max - min + 1)) + min;

        }

        return tab;
    }

    public static void positionValeur(int[] tab) {

    }

}