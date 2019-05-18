package etatV2.etat;

/**
 * Etat A
 * Implemente l interface EtatV2. EtatV2 place des exceptions par defauts pour chaque appel non Override
 */
public class EtatA implements EtatV2{

    private Context context;

    public EtatA(Context context){
        this.context = context;
    }

    @Override
    public void goToB() {
        context.setEtat(new EtatB(context));
    }

    @Override
    public void goToC() {
        context.setEtat(new EtatC(context));
    }
}
