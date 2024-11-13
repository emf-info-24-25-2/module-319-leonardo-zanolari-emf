package devoirs.devoir02;

public class devoir2 {
    //RIF: attention a la donnée: ça doit etre des constantes
    public static int taillereservoira = 8;
    public static int taillereservoirb = 11;

    public static void main(String[] args) {
        //RIF: ici il faudrait un nombre entre 0 et la somme des tailles des 2 réservoirs
        //RIF: respectez également les noms de variables demandés dans la donnée
        int random = (int) ((taillereservoira * Math.random()) + taillereservoira);
        int tailletab = taillereservoira + taillereservoirb;
        int remplisage = random;

        //RIF: intéressante improvisation mais ce n'est pas ce que demande l'exercice
        String[] reservoir = new String[tailletab];

        for (int i = 0; i < reservoir.length; i++) {
            reservoir[i] = "r";
        }
        for (int i = remplisage; i < tailletab; i++) {
            reservoir[i] = "v";
        }

        for (int i = 0; i < reservoir.length; i++) {
            System.out.print(reservoir[i]);
        }
    }
}
