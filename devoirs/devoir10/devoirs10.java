public class devoirs10 {
    public static final int COTTERCAREA = 1;
    public static final int COTTERCAREB = 1;
    public static final int NBR_ESAIS = 999999;
    public static final int dvd = 1000;
public static void main(String[] args) {
    //je insere compteur qui vas avoir le nombre de point totaux
int compteur = 0;
double moyene = 0;
for (int index = 0; index < dvd; index++) {
    compteur=0;
    for (int nbressai = 0; nbressai <  NBR_ESAIS; nbressai++) {
        double x = Math.random();
        double y = Math.random();
        
        double ipot = Math.sqrt(x*x + y*y);
        if (ipot < 1) {
            compteur ++;
        }
        }
        
        double estimation = 4*(double)compteur/NBR_ESAIS;
        
        System.out.println(estimation);
        moyene += estimation;
}
moyene = moyene / dvd;
System.out.println(moyene);


}
    
}