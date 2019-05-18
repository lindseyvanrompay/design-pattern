package etatV1.etat;

/**
 * Un feu jaune. Prochain etat = Rouge
 */
public class FeuJaune implements Etat{

    private static final int TIMER_JAUNE = 2000;

    private final FeuContext feuContext;

    public FeuJaune(FeuContext feuContext){
        this.feuContext = feuContext;
    }

    /**
     * Change l'état de la classe mere en feu rouge
     * Puis change le timer
     */
    @Override
    public void prochainEtat() {
        feuContext.setEtat(new FeuRouge(feuContext));
        feuContext.setTimer(TIMER_JAUNE);
    }
}
