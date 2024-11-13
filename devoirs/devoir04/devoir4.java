package devoirs.devoir04;

//RIF: essayez de pas avoir trop de fichiers parasites dans vos dossiers, surtout a l'éval, il faut pas qu'il y ait de doute sur le fichier à corriger
public class devoir4 {
    public static void main(String[] args) {
        int jour = 0;
        int mois = 4;
        int annee =2020; 
        int joursan = 0;
       

   int[] jours = new int[]{31,28,31,30,31,30,31,31,30,31,30,31}; //RIF: astucieux de le faire avec un tableau, même si l'intention de la donnée est de le faire avec un switch. y arrivez-vous?
   if (jour < 1|| jour > 31 && jours[mois] == 31) { //RIF: par contre, votre tableau est décalé, car les mois vont de 1 à 12, et les cellules du tableau de 0 à 11
            System.out.println("mauvaisse variable");
            
   }else if (jour < 1|| jour > 30 && jours[mois] == 30) { //RIF: et le mois à 28?
    System.out.println("mauvaisse variable");
   }
   if (mois < 1|| mois > 12) {
    System.out.println("mauvaisse variable");
   }
   if (annee < 1) { //RIF: || annee >9999
    System.out.println("mauvaisse variable");
   }
        
    for (int i = 0; i < mois -1; i++) {
        joursan = joursan + jours[i];
    }
    joursan += jour; //RIF: ça c'est le devoir 3...
    if (annee % 4 == 0 && mois > 2) {
        joursan = joursan + 1;
    }
System.out.println(joursan);







}
}
