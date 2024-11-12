package devoirs.devoir06;
public class devoirs6 {
    public static int  TAILLE_TABLEU = 20;
    public static int  VALEUR_MIN = 0;
    public static int  VALEUR_MAX = 50;
    public static int VALEUR_RECHERCHEE = 7;
    public static void main(String[] args) {
        System.out.println();
    }

    public static int[] genereTableau(TAILLE_TABLEU) {
        int[] tableau = new int[TAILLE_TABLEU];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int)(Math.random() * (VALEUR_MAX - VALEUR_MIN + 1)) + VALEUR_MIN;
        genereTableau()=tableau[i];
        }

        return tableau;
    }

}