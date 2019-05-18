package strategy;

import strategy.canardStrategy.VolerStrategy;

/**
 * Une classe canard. On veut que celle ci vole (implemente VolerStrategy)
 * On va delegue ce role a un objet interchangeable
 */
public class Canard implements VolerStrategy {

    private VolerStrategy volerStrategy;

    public Canard(){};

    public Canard(VolerStrategy strategy){
        this.volerStrategy = strategy;
    }

    public void voler() {
        volerStrategy.voler();
    }

    public VolerStrategy getVolerStrategy() {
        return volerStrategy;
    }

    public void setVolerStrategy(VolerStrategy volerStrategy) {
        this.volerStrategy = volerStrategy;
    }


}
