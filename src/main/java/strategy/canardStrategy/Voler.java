package strategy.canardStrategy;

/**
 * Comportement Voler
 */
public class Voler implements VolerStrategy {

    @Override
    public void voler() {
        System.out.println("Je vole comme un canard");
    }
}
