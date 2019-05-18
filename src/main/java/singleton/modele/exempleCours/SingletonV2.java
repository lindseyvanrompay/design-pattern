package singleton.modele.exempleCours;

/**
 * Autre exemple du cours
 */
public class SingletonV2 {

    // Volatile ressemble à synchronized. Signifie à la JVM de ne pas stocker cette
    // variable dans le cache d'un thread. les Threads utiliseront donc toujours la mémoire partagée
    private volatile static SingletonV2 uniqueInstance;

    public static SingletonV2 getInstance(){
        if(uniqueInstance == null){
            // synchronized = le seul à pouvoir utiliser cette classe ?
            synchronized (SingletonV2.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonV2();
                }
            }
        }
        return uniqueInstance;
    }
}
