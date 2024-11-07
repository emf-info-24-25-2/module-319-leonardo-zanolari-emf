package devoirs.devoir02;

public class devoir2 {
    public static int taillereservoira = 8;
    public static int taillereservoirb = 11;

    public static void main(String[] args) {
        int random = (int) ((taillereservoira * Math.random()) + taillereservoira);
        int tailletab = taillereservoira + taillereservoirb;
        int remplisage = random;
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
