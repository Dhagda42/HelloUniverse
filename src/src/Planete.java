public class Planete {

    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs;
    Atmosphere atmosphere;

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
        if (typeVaisseau.equals("CHASSEUR")){
            totalVisiteurs = totalVisiteurs + 3;
        } else if (typeVaisseau.equals("FREGATE")) {
            totalVisiteurs = totalVisiteurs + 12;
        } else if (typeVaisseau.equals("CROISEUR")) {
            totalVisiteurs = totalVisiteurs + 3;
        }else {
            System.out.println("La valeur saisie n'est pas valide");
    }
    }
}
