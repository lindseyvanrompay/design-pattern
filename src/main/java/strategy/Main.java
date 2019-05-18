package strategy;

import strategy.canardStrategy.PasVoler;
import strategy.canardStrategy.Voler;
import strategy.canardStrategy.VolerStrategy;

public class Main {
    public static void main(String[] args) {

        // Creation d'un canard et de strategies.
        Canard canard = new Canard();
        VolerStrategy saitVoler = new Voler();
        VolerStrategy pasVoler = new PasVoler();


        // On change le comportement du canard
        canard.setVolerStrategy(saitVoler);
        canard.voler();

        // On change le comportement du canard
        canard.setVolerStrategy(saitVoler);
        canard.voler();


        // on change le comportement du canard avec une lambda.
        // Interface fonctionnelle (1 methode) = LAMBDA
        canard.setVolerStrategy(
                () -> System.out.println("J'utilise une lambda !")
        );

    }
}
