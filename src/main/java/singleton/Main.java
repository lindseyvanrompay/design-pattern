package singleton;

import singleton.modele.BddUtilisateurSingleton;
import singleton.modele.IUtilisateur;
import singleton.modele.Utilisateur;

public class Main {


    private static final int ID_0 = 0;

    public static void main(String[] args) {

        // base de donnees
        BddUtilisateurSingleton bdd;

        // utilisateur id=0 et id=1. CF classe Utilisateur
        Utilisateur utilisateur0 = new Utilisateur("Babar");
        Utilisateur utilisateur1 = new Utilisateur("Celestine");

        /*
        Constructeur prive ! Instanciation impossible !
        bdd = new BddUtilisateurSingleton();
        */

        // getInstance = Methode static. Pas besoin d'objet pour l'appeler
        bdd = BddUtilisateurSingleton.getInstance();
        bdd.addUtilisateur(utilisateur0);
        bdd.addUtilisateur(utilisateur1);

        // On rapelle la méthode getInstance(). On recupère le même objet qu'auparavent
        // et on retrouve notre utilisateur
        IUtilisateur utilisateur = BddUtilisateurSingleton.getInstance().getUtilisateur(ID_0);
        System.out.println(utilisateur.getNom());
    }
}
