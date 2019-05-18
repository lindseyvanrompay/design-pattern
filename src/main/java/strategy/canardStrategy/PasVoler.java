package strategy.canardStrategy;

/**
 * Comportement PasVoler
 */
public class PasVoler implements VolerStrategy {

    @Override
    public void voler() {
        System.out.println("Je vole pas !");
    }
}
