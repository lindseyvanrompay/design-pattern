package etatV1.etat;

public class FeuVert implements Etat {

    private static final int TIMER_VERT = 2000;

    private final FeuContext feuContext;

    public FeuVert(FeuContext feuContext) {
        this.feuContext = feuContext;
    }

    @Override
    public void prochainEtat() {
        feuContext.setEtat(new FeuJaune(feuContext));
        feuContext.setTimer(TIMER_VERT);
    }
}
