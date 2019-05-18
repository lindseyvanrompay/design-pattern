package etatV2.etat;

/**
 * Une classe possédant un état doit implementer cette classe
 * Cela permet à l'état fille de changer l'état courant de la classe mere.
 * La classe parent peut aussi faire monEtat = monEtat.prochainEtat();
 */
public interface Context {
    public void setEtat(EtatV2 etat);
}
