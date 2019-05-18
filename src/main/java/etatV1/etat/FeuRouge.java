package etatV1.etat;


/**
 * Un feu jaune. Prochain etat = Vert
 */
public class FeuRouge implements Etat {

    private static final int TIMER_ROUGE = 1000;

    private final FeuContext feuContext;

    public FeuRouge(FeuContext feuContext){
        this.feuContext = feuContext;
    }

    /**
     * Change l'état de la classe mere en feu rouge
     * Puis change le timer
     */
    @Override
    public void prochainEtat() {
        feuContext.setEtat(new FeuVert(feuContext));
        feuContext.setTimer(TIMER_ROUGE);
    }
}
