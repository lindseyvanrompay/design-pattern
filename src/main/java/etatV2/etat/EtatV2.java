package etatV2.etat;

/**
 * Interface Etat. Implemente toute les methodes en donnant une implementation par defaut.
 * Ici, chaque prochain etat lance une exception.
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
