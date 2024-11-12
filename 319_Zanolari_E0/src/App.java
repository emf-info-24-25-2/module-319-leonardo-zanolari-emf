public class App {
    // ici je j'appele les constantes que je vais utiliser
    public static final int NOTE_MIN = 1;
    public static final int NOTE_MAX = 6;
    public static final int NBRE_NOTES = 5;

    public static void main(String[] args) throws Exception {
        // ici je appele le tableux notesobtenues
        int[] notesObtenues = new int[NBRE_NOTES];
        // ici je appele les differentes variables que je vais utiliser
        float totaleNote = 0;
        float moyenne;
        int i;
        // ici je fait une boucle qui vas donner chaque notes dans le index du tableux
        // demander pour cela dans for on vas utiliser math.random puis nous ajoutons le
        // nombre dans notesobtenues
        for (i = 0; i < notesObtenues.length; ++i) {
            int nombreAleatoire = 1 + (int) (Math.random() * ((6 - 1) + 1));
            notesObtenues[i] = nombreAleatoire;
        }
        // ici je utilise une boucle for qui vas me servir a testes chaque letre, puis
        // dans la boucle je utilise switch qui vas controller si ma note est 4,5,6 u
        // moins de 4 qui dans ce cas et le default puis vas print le text desirer
        for (i = 0; i < notesObtenues.length; ++i) {
            switch (notesObtenues[i]) {
                case 4:
                    System.out.println("La note obtenue est " + notesObtenues[i] + " : " + "suffisant");
                    break;
                case 5:
                    System.out.println("La note obtenue est " + notesObtenues[i] + " : " + "bien");
                    break;

                case 6:
                    System.out.println("La note obtenue est " + notesObtenues[i] + " : " + "trés bien");
                    break;

                default:
                    System.out.println("La note obtenue est " + notesObtenues[i] + " : " + "insuffisant");

                    break;
            }
            // ici j'ajoute la note dans moyenne pour la diviser plus tard
            totaleNote = totaleNote + notesObtenues[i];

        }
        // ici je commence par diviser moyenne par NBRE_NOTES puis je utilise if pour
        // savoir si la moyenne et en dessous ou en dessus de 4 puis je print la phrase
        // qui correspond.
        totaleNote /= NBRE_NOTES;
        moyenne = totaleNote;
        if (moyenne < 4) {
            System.out.println("La moyenne est de : " + moyenne);
            System.out.println("L'eleve est non promu !");
        } else {
            System.out.println("La moyenne est de : " + moyenne);
            System.out.println("L'eleve est promu !");
        }
    }
}
