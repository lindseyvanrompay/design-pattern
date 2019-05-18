package fabrique;

import fabrique.Jouet.Chien;
import fabrique.Jouet.Jouet;
import fabrique.Jouet.Robot;
import fabrique.fabrique.FabriqueDeJouet;
import fabrique.fabrique.IFabriqueDeJouet;

import static fabrique.fabrique.IFabriqueDeJouet.Type.JOUET_CHIEN;
import static fabrique.fabrique.IFabriqueDeJouet.Type.JOUET_ROBOT;

public class Main {

    public static void main(String[] args) {

        // Implementation d'une interface avec une méthode fabriquerJouet
        IFabriqueDeJouet fabriqueDeJouet = new FabriqueDeJouet();


        // Ici, la fabrique est une INTERFACE FONCTIONNELLE (interface avec une seule methode)
        // On peut la remplacer par une Lambda.
        // La lambda devine les parametre en se basant sur l'interface
        IFabriqueDeJouet fabriqueLambda =
                (type) -> {
                    switch (type) {
                        case JOUET_ROBOT:
                            System.out.println("Fabrication d'un robot par lambda");
                            return new Robot();
                        case JOUET_CHIEN:
                            System.out.println("Fabrication d'un chien par lambda");
                            return new Chien();
                        default:
                            // Exception non controlée. Pas besoin de try catch (mais on peut)
                            throw new IllegalArgumentException("Type inconnu !");
                    }
                };


        Jouet robot = fabriqueDeJouet.fabriquerJouet(JOUET_ROBOT);
        Jouet chien = fabriqueLambda.fabriquerJouet(JOUET_CHIEN);

        System.out.println("\n************** Magnifique animalerie **************");
        robot.jouer();
        chien.jouer();
        System.out.println("***************************************************");
    }
}
