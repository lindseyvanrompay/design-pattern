package fabrique.Jouet;

/**
 * Juste un objet
 */
public class Robot implements Jouet {
    @Override
    public void jouer() {
        System.out.println("Je joue avec un robot");
    }
}
