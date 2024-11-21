public class Planete {

    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs;

    int revolution(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile.");
        return degres / 360;
    }

    int rotation(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même.");
        return degres / 360;
    }

    void accueillirVaisseau(int nbHumainsArrives){
        totalVisiteurs = totalVisiteurs + nbHumainsArrives;
    }

    void accueillirVaisseau(String typeVaisseau){
        switch (typeVaisseau){
            case "CHASSEUR":
                totalVisiteurs = totalVisiteurs += 3;
                break;

            case "FREGATE":
                totalVisiteurs = totalVisiteurs += 12;
                break;

            case "CROISEUR":
                totalVisiteurs = totalVisiteurs += 50;
                break;

            default:
                System.out.println("La valeur saisie n'est pas correcte.");
        }
    }
}
