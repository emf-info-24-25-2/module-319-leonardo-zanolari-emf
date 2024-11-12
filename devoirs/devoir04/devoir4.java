package devoirs.devoir04;

public class devoir4 {
    public static void main(String[] args) {
        int jour = 0;
        int mois = 4;
        int annee =2020; 
        int joursan = 0;
       

   int[] jours = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
   if (jour < 1|| jour > 31 && jours[mois] == 31) {
            System.out.println("mauvaisse variable");
            
   }else if (jour < 1|| jour > 30 && jours[mois] == 30) {
    System.out.println("mauvaisse variable");
   }
   if (mois < 1|| mois > 12) {
    System.out.println("mauvaisse variable");
   }
   if (annee < 1) {
    System.out.println("mauvaisse variable");
   }
        
    for (int i = 0; i < mois -1; i++) {
        joursan = joursan + jours[i];
    }
    joursan += jour;
    if (annee % 4 == 0 && mois > 2) {
        joursan = joursan + 1;
    }
System.out.println(joursan);







}
}
