import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {

        String monprenom;
        char[] maChaineDeCaractere = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        Scanner questionnom = new Scanner(System.in);
        System.out.println("entrez votre prenom");
        monprenom = questionnom.nextLine();
        System.out.println();

        for (int i = 0; i < monprenom.length(); ++i) {
            char l = monprenom.charAt(i);
            for (int j = 0; j < maChaineDeCaractere.length; ++j) {
                if (maChaineDeCaractere[j] == l) {
                    System.out.println(l + 1 + " " + j);

                }

            }

        }

    }

}