package etatV2.etat;

/**
 * Interface Etat. On peut y ajouter des methodes par defaut si elles ne sont pas Override par les filles
 */
public interface EtatV2 {
    public default void goToA(){
        throw new IllegalStateException("Impossible d'aller a A !");
    }

    public default void goToB(){
        throw new IllegalStateException("Impossible d'aller a B !");

    }

    public default void goToC(){
        throw new IllegalStateException("Impossible d'aller a C !");

    }

    public default void goToD(){
        throw new IllegalStateException("Impossible d'aller a D !");
    }
}
