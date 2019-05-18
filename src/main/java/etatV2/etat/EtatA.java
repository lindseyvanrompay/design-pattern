package etatV2.etat;

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
