package etatV1;

import etatV1.etat.Etat;
import etatV1.etat.FeuContext;
import etatV1.etat.FeuVert;

/**
 * @implNote
 * Etat : methode prochainEtat(). Demande au feu de changer son etat
 * FeuContext : permet à la classe fille de changer l'état du parent
 * Runnable : Une histoire de Thread
 */
public class Feu implements Etat, FeuContext, Runnable{

    private final String name;
    private int timer = 1000;
    private Etat etat;

    public Feu(String name){
        this.name = name;
        etat = new FeuVert(this);
    }

    /**
     * Permet à l'état courant de modifier son etat.
     */
    @Override
    public void setEtat(Etat etat) {
        this.etat = etat;
        System.out.println(name + " passe a : " + etat.getClass().getSimpleName());
    }

    @Override
    public void setTimer(int timer) {
        this.timer = timer;
    }


    /**
     * Demande à l'état d'aller au suivant.
     * L'état va juste appeler setEtat au dessus.
     */
    @Override
    public void prochainEtat() {
        etat.prochainEtat();
    }


    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(timer);
                prochainEtat();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
