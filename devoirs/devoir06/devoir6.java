public class devoir6 {
    final static int VALEUR_MIN = 0;
    final static int VALEUR_MAX = 50;
    final static int TAILLE_TABLEU = 20;
    final static int VALEUR_RECHERCHER = 7;
    static int[] genereTableau;
public static void main(String[] args) {

    int variable1 = (int) (Math.random() * 18);
    System.out.println("Ma valeur : " + variable1);

    maMethode(variable1);
    maMethode(6);

    // for (int index = 0; index < TAILLE_TABLEU; index++) {
    //     genereTableau[] = genereTableau(int);
        
    // }

}
    
public static void maMethode(int chocolat){
    System.out.println("le triple de " + chocolat + " est " + 3*chocolat);
}

// public static int rechercheMin (){
//     i = VALEUR_MAX;
//     for (int index = 0; index < TAILLE_TABLEU; index++) {
//         if (i < genereTableau[index]) {
//             i = genereTableau[index];
//         }
//     }

// }


// public static int[]  genereTableau (){

// for (int index = 0; index < TAILLE_TABLEU; index++) {
    
// }

// }
}







    
