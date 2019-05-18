package etatV2.etat;

public class EtatC implements EtatV2 {
    private final Context context;

    public EtatC(Context context) {
        this.context = context;
    }

    @Override
    public void goToA() {
        context.setEtat(new EtatA(context));
    }

    @Override
    public void goToD() {
        context.setEtat(new EtatD(context));
    }
}
