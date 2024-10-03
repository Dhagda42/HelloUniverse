public class Main {
    public static void main(String[] args) {
        int annee = 2006;
        int nbPlanetes = 8;

        if (annee < 2006){
            nbPlanetes = 9;
        }
        else{
            nbPlanetes = 8;
        }
        System.out.printf("En %d, le nombre de planète est de %d", annee, nbPlanetes);
    }
}