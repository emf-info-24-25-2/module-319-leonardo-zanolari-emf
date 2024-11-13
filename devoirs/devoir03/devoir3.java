package devoirs.devoir03;

public class devoir3 {
    public static void main(String[] args) {
        int jour = 1;
        int mois = 4;
        int annee =2020; 
        int joursan = 0;

   int[] jours = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    
        //RIF: Attention, en janvier, le nombre de jour est dans la cellule 0, et le numéro du mois est 1. 
        //RIF: attention également, vous devez savoir le faire avec des tests if ou switch (la donnée limitait les instructions disponibles)
    for (int i = 0; i < mois -1; i++) {
        joursan = joursan + jours[i];
    }
    joursan += jour;
    if (annee % 4 == 0 && mois > 2) { //RIF: et les années spéciales? (multiples de 100 et de 400 :-) )
        joursan = joursan + 1;
    }
System.out.println(joursan); //RIF: ajoutez une petite phrase là autour







}
}
