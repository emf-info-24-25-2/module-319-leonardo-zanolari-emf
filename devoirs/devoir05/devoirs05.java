package devoirs.devoir05;

import java.util.Scanner;

public class devoirs05 {
    public static void main(String[] args) {
        int nombrej = 0;
        int nombrem = (int)( Math.random() * ( 1 - 100 + 1 )) + 1;
        Scanner scanner = new Scanner( System.in );






while (nombrej != nombrem) {
    System.out.print( "Entrez une valeur svp : " );
    scanner.nextLine();
nombrej = scanner.nextInt();
    
if (nombrej == nombrem) {
    System.out.print("vous avez ganer" + " la valeur etait bien" + nombrem); 
}
else if (nombrej < nombrem) {
    System.out.print("trop petit"); 
}
else if (nombrej > nombrem) {
    System.out.print("le nombre et trop grand"); 
}





}


























scanner.close();
    }
}
