import java.util.Scanner;

public class e2 {

    final static int PRIX_CATEGORIE_UN = 25;
    final static int PRIX_CATEGORIE_DEUX = 18;
    final static int PRIX_CATEGORIE_TROIS = 12;
    final static int[] CATEGORIE_SALLE = { 3, 3, 2, 2, 1, 1, 2, 2, 3, 3 };

    public static void main(String[] args) {
        
        boolean[] occupationsalle = new boolean[CATEGORIE_SALLE.length];
        for (int index = 0; index < occupationsalle.length; index++) {
            affichertarif();
            affichersalle(occupationsalle);
            int[] placechoisie = placelibre(occupationsalle);
            occupationsalle = acheterbillet(occupationsalle,placechoisie);
            System.out.println("voicie les place qui reste apres votre choix");
            affichersalle(occupationsalle);
        }

        return;
    }

    public static void affichertarif() {
        System.out.println("tarif 3 et de " + PRIX_CATEGORIE_TROIS + " frs");
        System.out.println("tarif 2 et de " + PRIX_CATEGORIE_DEUX + " frs");
        System.out.println("tarif 1 et de " + PRIX_CATEGORIE_UN + " frs");
    }

    public static void affichersalle(boolean[] a) {

        for (int index = 0; index < a.length; index++) {
            if (a[index] == false) {
                System.out.print(" v ");
            } else {

                System.out.print(" p ");
            }

        }
        System.out.println("");
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            System.out.print(" " + CATEGORIE_SALLE[i] + " ");
        }

    }

final static int[] placelibre(boolean[] a){
int i = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("");
System.out.println("entrez le tarif de la place ou vous voulez etre");
    int place = scanner.nextInt();
    int[] places = new int[a.length]; 
for (int index = 0; index < a.length; index++) {
    if (CATEGORIE_SALLE[index] == place && a[index] == false ) {
        System.out.println("la place numero"  + (index + 1)  + " et libre");
        i++;
        
      places[i] = place + index + 1; 
    }
}


scanner.close();
return places;
}


public static boolean[] acheterbillet(boolean[] a,int[]){




}





}