
public class exerciceTableux3 {
    public static void main(String[] args) {
        int[] notes = new int[10];
        int moyene;
        int toutes = 0;
        for (int l = 0; l < 10; l++) {
            int nombreAleatoire = 1 + (int) (Math.random() * ((6 - 1) + 1));
            notes[l] = nombreAleatoire;
            System.out.println(notes[l]);
            toutes = toutes + notes[l];

        }
        moyene = toutes / 10;
        System.out.println("voicie la moyenne " + moyene);
    }

}
