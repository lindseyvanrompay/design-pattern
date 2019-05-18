package fabrique.fabrique;

import fabrique.Jouet.Chien;
import fabrique.Jouet.Jouet;
import fabrique.Jouet.Robot;


public class FabriqueDeJouet implements IFabriqueDeJouet{

    // Variable publique accessible en dehors de la classe

    /**
     * Une facon de faire : un switch géant si les objets rendu ont un type commun
     * @param type enumeration dans l'interface
     *
     * @return Un jouet
     */
    @Override
    public Jouet fabriquerJouet(Type type){
        switch (type){
            case JOUET_ROBOT:
                System.out.println("Fabrication d'un robot par fabrique");
                return new Robot();
            case JOUET_CHIEN:
                System.out.println("Fabrication d'un chien par fabrique");
                return new Chien();
            default:
                // Exception non controlée. Pas besoin de try catch (mais on peut)
                throw new IllegalArgumentException("Type inconnu !");
        }
    }


    // Autre possibilite si les types de retour sont differents
    // Rajouter les à l'interface si vous utilisez ces méthodes.

    /**
     * Fabrique un chien
     * @return nouveau chien
     */
    public Jouet fabriquerChien(){
        return new Chien();
    }

    /**
     * Fabrique un robot
     * @return nouveau robot
     */
    public Jouet fabriquerRobot(){
        return new Robot();
    }
}
