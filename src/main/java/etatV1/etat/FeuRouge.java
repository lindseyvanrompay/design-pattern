package etatV1.etat;

public class FeuRouge implements Etat {

    private static final int TIMER_ROUGE = 1000;

    private final FeuContext feuContext;

    public FeuRouge(FeuContext feuContext){
        this.feuContext = feuContext;
    }
    @Override
    public void prochainEtat() {
        feuContext.setEtat(new FeuVert(feuContext));
        feuContext.setTimer(TIMER_ROUGE);

    }
}
