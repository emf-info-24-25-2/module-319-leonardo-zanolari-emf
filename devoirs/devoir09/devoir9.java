package devoirs.devoir09;

public class devoir9 {
    public static final int NBRE_CHIFFRES = 6;
    public static final int MIN = 0;
    public static final int MAX = 42;

    public static void main(String[] args) {
        System.out.println("Tirage du loto :");
        genereTirage(NBRE_CHIFFRES, MIN, MAX);
    }

    public static void genereTirage(int nbre, int min, int max) {
        int[] tab = new int[nbre];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (max - min + 1)) + min;
            boolean existe = false;
            for (int j = 0; j < i; j++) {
                if (tab[j] == tab[i]) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                i--;
                continue;
            }
            System.out.println(tab[i]);
        }
    }
}

