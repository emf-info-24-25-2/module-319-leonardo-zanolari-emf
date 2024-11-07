public class App {
    public static void main(String[] args) throws Exception {
        int aleatoire = (int) (Math.random() * (10 - 1 + 1)) + 1;
        int[] tableau = new int[aleatoire];
        int[] chocolat = new int[aleatoire];

        for (int i = 0; i < tableau.length; i++) {
            int aleatoire2 = (int) (Math.random() * (10 - 1 + 1)) + 1;
            tableau[i] = aleatoire2;
        }

        int[] resultat=inverseLeTableau(tableau);
        int[] resultat2=inverseLeTableau(chocolat);

        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] +" ");
        }
        System.out.println();
        for (int i = 0; i < resultat.length; i++) {
            System.out.print(resultat[i] +" ");
        }
    }

    public static int[] inverseLeTableau(int[] tabA){
        int[] tabB = new int[tabA.length];
        for (int i = 0; i < tabB.length; i++) {
            tabB[i] = tabA[tabA.length - i - 1];
        }
        return tabB;
    
    }
}