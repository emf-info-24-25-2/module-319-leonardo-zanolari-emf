import java.util.Scanner;

public class e2 {

    final static int PRIX_CATEGORIE_UN = 25;
    final static int PRIX_CATEGORIE_DEUX = 18;
    final static int PRIX_CATEGORIE_TROIS = 12;
    final static int[] CATEGORIE_SALLE = { 3, 3, 2, 2, 1, 1, 2, 2, 3, 3 };

    public static void main(String[] args) {
        
        boolean[] occupationsalle = new boolean[CATEGORIE_SALLE.length];
        int commande =-1;
        Scanner scanner = new Scanner(System.in);
        while(commande!=0){
            System.out.println("-----------------------------------------------");
            System.out.println("1 = Commander...");
            int input= scanner.nextInt();

            //8.3.4
            switch(input){
                case 0: System.out.println("Au revoir");
                    break;
                case 1: occupationSalle=commanderBillet(occupationSalle);
                        break;
                case 2: afficherTarifs();
                    break;
                case 3: afficherSalle();
                    break;
                default: System.out.println("Commande inconnue");
                }
        }
            
       // for (int index = 0; index < occupationsalle.length; index++) {
         //   affichertarif();
         //   affichersalle(occupationsalle);
         //   int[] placechoisie = placelibre(occupationsalle);
         //   occupationsalle = acheterbillet(occupationsalle,placechoisie);
         //   System.out.println("voicie les place qui reste apres votre choix");
          //  affichersalle(occupationsalle);
        // }

        scanner.close();
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

final static int[] placelibre(boolean[] a){ //public static int trouverPlace(int categorie, boolean[] occupationSalle){
int i = 0; //-1

    //int[] places = new int[a.length]; 
for (int index = 0; index < a.length; index++) {
    if (CATEGORIE_SALLE[index] == categorie && a[index] == false ) { //la categorie correspond ET la place est libre
        //System.out.println("la place numero"  + (index + 1)  + " et libre");
        i=index;
        break;
        //i++;
        
      //places[i] = place + index + 1; 
    }
}


return places; //return i;
}


public static boolean[] commanderBillet(boolean[] occupationSalle){

        //7.1
        //sout avec le texte

    //7.2
    Scanner scanner = new Scanner(System.in);
    int place=0;
    
    System.out.println("Quelle categorie voulez-vous : ");
    int place = scanner.nextInt();
    if(place>=1 && place<=3){

        //7.3.1
        int positionPlace= trouverPlace(place, occupationSalle);

        //7.3.2
        if(positionPlace != -1){
            //7.3.2.1
            occupationSalle[positionPlace]=true;
            //7.3.2.2
            switch(place){
                case 1: 
                    System.out.println("Votre place est réservée et coûte: " +PRIX_CATEGORIE_UN + " CHF);
                    break;
                case 2:  
                    System.out.println("Votre place est réservée et coûte: " +PRIX_CATEGORIE_DEUX + " CHF);
                    break;
                case 3:  
                    System.out.println("Votre place est réservée et coûte: " +PRIX_CATEGORIE_TROIS + " CHF);
                    break;
            }
        }
        else{
            System.out.println("Aucune place disponible");
        }
    else{
        System.out.println("Cette catégorie n'existe pas");
    }

    scanner.close();
    return occupationSalle;

}





}
