package devoirs.devoir06;
 
public class devoir06 {
    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;
 
    public static int[] genereTableau(int taille, int min, int max) {
        int[] tableau = new int[taille];
 
        for (int i = 0; i < taille; i++) {
            tableau[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
 
        return tableau;
    }
 
    public static int rechercheMin(int[] tableau) {
        int min = tableau[0];
 
        for (int valeur : tableau) {
            if (valeur < min) {
                min = valeur;
            }
        }
 
        return min;
    }
 
    public static int rechercheMax(int[] tableau) {
        int max = tableau[0];
 
        for (int valeur : tableau) {
            if (valeur > max) {
                max = valeur;
            }
        }
 
        return max;
    }
 
    public static int rechercheValeur(int[] tableau, int valeurRecherchee) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                return i;
            }
        }
 
        return -1;
    }
 
    public static void main(String[] args) {
        int[] tableau = genereTableau(TAILLE_TABLEAU, VALEUR_MIN, VALEUR_MAX);
 
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau[" + i + "] = [" + tableau[i] + "]");
        }
 
        int min = rechercheMin(tableau);
        int max = rechercheMax(tableau);
        System.out.println("La plus petite valeur trouvée est : " + min);
        System.out.println("La plus grande valeur trouvée est : " + max);
 
        int position = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        if (position != -1) {
            System.out.println(
                    "Le nombre [" + VALEUR_RECHERCHEE + "] figure à la position [" + position + "] du tableau");
        } else {
            position = (int) (Math.random() * ((-1) - (-100) + 1)) + (-100);
            System.out.println(
                    "Le nombre [" + VALEUR_RECHERCHEE + "] figure à la position [" + position + "] du tableau");
        }
    }
}
