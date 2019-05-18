package etatV2.etat;

/**
 * Etat B
 * Implemente l interface EtatV2. EtatV2 place des exceptions par defauts pour chaque appel non Override
 */

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
