package devoirs.devoir08;

public class devoir8 {
    public static final String[] CARACTERES = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
    public static final int NBRE_ESSAI = 5;
    public static final int TAILLE_MOT_DE_PASSE = 5;

    public static void main(String[] args) {

        int[] tab = new int[TAILLE_MOT_DE_PASSE];
        tab = genereMotDePasse(TAILLE_MOT_DE_PASSE);
        for (int index = 0; index < array.length; index++) {
            System.out.println(tab[index]);
        }
       int[] tab1 = trouverlecode(NBRE_ESSAI,tab);
       for (int index = 0; index < tab1.length; index++) {
        System.out.println(tab1);
       }

    }

    public static int[] genereMotDePasse(int tm) {
        int[] motdepasse = new int[tm];
        for (int index = 0; index < motdepasse.length; index++) {
            motdepasse = CARACTERES[(int) (Math.random() * (CARACTERES.length - 0 + 1)) + 0];

        }

        return motdepasse;
    }
   public static int trouverlecode(int m,int[] b){
    int[] bm = new int[b.length];
for (int index = 0; index < m; index++) {
   for (int i = 0; i < m; index++) {
    if (CARACTERES(index)  == b[i] ) {
        bm[i] = b[i];
    }
   }

}


    return bm;
    }
}
