import java.util.Scanner;

public class E1_ShutTheBox_ZanolariLeonardo {
    public static final int DES_MIN = 1;
    public static final int DES_MAX = 6;
    public static final int NOMBRE_TUILES = 12;

    public static void main(String[] args) {
        int des1;
        int des2;
        int[] tuiles = new int[NOMBRE_TUILES];
        boolean enjeux = true;
        int totaldes;
        System.out.println(
                "***********************************\n*       'shut  the  box'          *\n***********************************\nil faut baisser les tuiles pour avoirun total equivalent au total de la sommes des dés.\nLe 0 permet de terminer la partie.\n");
        for (int index = 0; index < tuiles.length; index++) {
            tuiles[index] = index + 1;
        }

        while (enjeux != false) {
            des1 = tirelesDes();
            des2 = tirelesDes();
            totaldes = des1 + des2;
            afficheTuiles(tuiles);
            System.out.println("Les nombres tirés sont : " + des1 + " et " + des2 + " qui font un total de " + totaldes
                    + "\ndonnez le(s) nombre(s) à enlever");
            tuiles = enlevetuiles(tuiles, totaldes);
            enjeux = contientEncoreDesTuilesAbaisser(tuiles);
        }

    }

    public static void afficheTuiles(int tuiles[]) {
        for (int index = 0; index < tuiles.length; index++) {
            System.out.print("|" + tuiles[index] + "|");
        }
        System.out.println(" ");
    }

    public static boolean contientEncoreDesTuilesAbaisser(int[] tuiles) {
        int tuilesrestantes = 0;
        boolean contientEncoreDesTuilesAbaisser = true;
        for (int index = 0; index < tuiles.length; index++) {
            if (tuiles[index] > 0) {
                ++tuilesrestantes;
            }
        }
        if (tuilesrestantes == 0) {
            contientEncoreDesTuilesAbaisser = false;
        }
        return contientEncoreDesTuilesAbaisser;
    }

    public static int[] copietableux(int[] tableux) {
        int[] copie = tableux;
        return copie;
    }

    public static int tirelesDes() {
        int tirelesdes;
        tirelesdes = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;

        return tirelesdes;
    }

    public static int[] enlevetuiles(int[] tuiles, int totaldes) {
        int[] tuiletemp = copietableux(tuiles);
        Scanner scanner = new Scanner(System.in);
        int valeur = scanner.nextInt();
        int totaelenlever = 0;
totaelenlever = valeur;
 while (condition) {
    if (totaelenlever > 1 || totaelenlever < totaldes || 0 != tuiletemp[totaelenlever - 1]) {
             
    }else {
 System.out.println("vous avez deja enlever le " + totaelenlever);

    }

if (totaelenlever < totaldes) {
    totaldes = totaldes - totaelenlever;
    System.out.println("ils vous manque " + totaldes + " reprener un chifre");
    totaelenlever = scanner.nextInt();
}
if () {
    
}
 }
           


        scanner.close();
        return tuiles;
    }

}
