public class Main {
    public static void main(String[] args) {
        int annee = 2024;
        int nbPlanetes = 8;

        if (annee < 1600 || annee > 2024){
            System.out.println("Le programme ne peut pas fournir de résultat pour l'année" +annee);
        }
        else {
            if (annee < 1781){
                nbPlanetes = 7;
            }
            else if (annee < 1846){
                nbPlanetes = 8;
            }
            else if (annee < 2006){
                nbPlanetes = 9;
            }
            else{
                nbPlanetes = 8;
            }
        }
        System.out.printf("Le nombre de planètes dans le système solaire en %d est de %d", annee, nbPlanetes);

    }
}