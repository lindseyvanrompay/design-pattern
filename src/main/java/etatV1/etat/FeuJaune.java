package etatV1.etat;

public class FeuJaune implements Etat{

    private static final int TIMER_JAUNE = 2000;

    private final FeuContext feuContext;

    public FeuJaune(FeuContext feuContext){
        this.feuContext = feuContext;
    }
    @Override
    public void prochainEtat() {
        feuContext.setEtat(new FeuRouge(feuContext));
        feuContext.setTimer(TIMER_JAUNE);
    }
}
