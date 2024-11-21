public class Main {
    public static void main(String[] args) {

        Planete mercure = new Planete();
            mercure.nom = "Mercure";
            mercure.matiere = "Tellurique";
            mercure.diametre = 4880;

        Planete venus = new Planete();
            venus.nom = "Vénus";
            venus.matiere = "Tellurique";
            venus.diametre = 12100;

        Planete terre = new Planete();
            terre.nom = "Terre";
            terre.matiere = "Tellurique";
            terre.diametre = 12756;

        Planete mars = new Planete();
            mars.nom = "Mars";
            mars.matiere = "Tellurique";
            mars.diametre = 6792;

        Planete jupiter = new Planete();
            jupiter.nom = "Jupiter";
            jupiter.matiere = "Gazeuse";
            jupiter.diametre = 142984;

        Planete saturne = new Planete();
            saturne.nom = "Saturne";
            saturne.matiere = "Gazeuse";
            saturne.diametre = 120536;

        Planete uranus = new Planete();
            uranus.nom = "Uranus";
            uranus.matiere = "Gazeuse";
            uranus.diametre = 51118;

        Planete neptune = new Planete();
            neptune.nom = "Neptune";
            neptune.matiere = "Gazeuse";
            neptune.diametre = 49532;

        Planete pluton = new Planete();
            pluton.nom = "Pluton";
            pluton.matiere = "Tellurique";
            pluton.diametre = 2300;

        Planete X = new Planete();

        System.out.println(jupiter.nom+" est une planète "+jupiter.matiere+" avec un diamètre de "+jupiter.diametre+" kilomètres");
        System.out.println(X.nom+" est une planète "+X.matiere+" avec un diamètre de "+X.diametre+" kilomètres");

        int nbTours = neptune.revolution(-3542);
        System.out.println(neptune.nom+" a effectué "+nbTours+" tours complets autour de son étoile.");
        nbTours = mars.rotation(-684);
        System.out.println(mars.nom+" a effectué "+nbTours+" tours sur elle-même.");
        nbTours = venus.rotation(1250);
        System.out.println(venus.nom+" tourne sur elle-même de "+nbTours+" tours");

        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");

        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de "+mars.totalVisiteurs+".");
        }
    }
