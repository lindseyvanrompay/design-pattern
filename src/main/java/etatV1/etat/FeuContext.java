package etatV1.etat;


/**
 * Une classe possédant un etat doit implémenter cette classe.
 * Cela permet à la classe fille de changer l'état du parent
 * La classe parent peut aussi faire monEtat = monEtat.prochainEtat();
 */
public interface FeuContext {

    /**
     * 2 facon de faire : Soit le parent fait monEtat = monEtat.prochainEtat.
     * Soit l etat fille change directement la classe mere
      */
    public void setEtat(Etat etat);


    /**
     * Specifique au controle
     */
    public void setTimer(int timer);
}
