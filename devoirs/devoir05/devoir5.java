package devoirs.devoir05;

import java.util.Scanner;

//RIF: attention à l'indentation! mettez aussi des noms de variables explicites ou des commentaires
public class devoir5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int nb1 = (int)( Math.random() * ( 100 - 1 + 1 )) + 1;
int nb2 = 0;


        
        
        
        while (nb1 != nb2) {
            System.out.println("entrez le nombre que vous penses");
        nb2 = scanner.nextInt();
           if (nb2 == nb1) {
            System.err.println("bravo tu as trouver");
           }else if (nb2 > nb1) {
            System.err.println("trop grand");
           }else if (nb2 < nb1) {
            System.err.println("trop petit");
               //RIF: comptez aussi le nombre de tentatives du joueur


        }
        
    }
    }
}
