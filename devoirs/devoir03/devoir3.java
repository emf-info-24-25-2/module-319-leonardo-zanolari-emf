package devoirs.devoir03;

public class devoir3 {
    public static void main(String[] args) {
        int jour = 1;
        int mois = 4;
        int annee =2020; 
        int joursan = 0;

   int[] jours = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    
        
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