package fabrique.Jouet;

public class Chien implements Jouet {
    @Override
    public void jouer() {
        System.out.println(this);;
    }


    /**
     * Override de toString
     * Permet de faire system.out.println(this)
      */
    @Override
    public String toString(){
        return "Je suis un chien";
    }
}
