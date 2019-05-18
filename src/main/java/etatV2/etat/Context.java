package etatV2.etat;

/**
 * Une classe possédant un état doit implementer cette classe
 * Cela permet à l'état fille de changer l'état courant de la classe mere
 */
public interface Context {
    public void setEtat(EtatV2 etat);
}
