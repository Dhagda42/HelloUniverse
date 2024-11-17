public class Planete {

    String nom;
    String matiere;
    long diametre;

    int revolution(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile.");
        return degres / 360;
    }

    int rotation(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même.");
        return degres / 360;
    }
}
