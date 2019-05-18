package etatV2.etat;

public class EtatD implements EtatV2 {

    private final Context context;

    public EtatD(Context context) {
        this.context = context;
    }

    @Override
    public void goToA() {
        context.setEtat(new EtatA(context));
    }

    @Override
    public void goToB() {
        context.setEtat(new EtatB(context));

    }
}
