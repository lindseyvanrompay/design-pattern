package singleton.modele.exempleCours;

/**
 * Exemple du cours
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){};

    private Singleton getInstance(){
        return uniqueInstance;
    }
}
