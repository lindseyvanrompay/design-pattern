package singleton.modele;

import java.util.HashMap;
import java.util.Map;

public class BddUtilisateurSingleton {
    // Mes donnees
    private Map<Integer, IUtilisateur> utilisateurMap;

    // Lors de la creation, je veux toujours donner le meme objet.
    // Variable static -> Variable partage par les objets BddUtilisateurSingleton
    //                  -> Variable non lie un objet
    private static BddUtilisateurSingleton bdd;

    /**
     * CONSTRUCTEUR PRIVE !!!
     * On veut empecher le programmeur de faire un new BddUtilisateurSingleton
     */
    private BddUtilisateurSingleton(){
        utilisateurMap = new HashMap<>();
    }

    /**
     * Instancie la variable bdd si elle ne l'a pas été et la retourne
     * Methode STATIC ! Elle peut exister sans l'objet ! (Et donc on peut l'appeler même sans avoir l'objet)
     *
     * @return L'instance UNIQUE de l'objet BddUtilisateurSingleton
     */
    public static BddUtilisateurSingleton getInstance(){
        if(bdd == null){
            bdd = new BddUtilisateurSingleton();
        }
        return bdd;
    }


    /**
     * Ajoute un utilisateur. Son id est généré à sa création
     *
     * @param utilisateur un utilisateur
     */
    public void addUtilisateur(IUtilisateur utilisateur){
        this.utilisateurMap.putIfAbsent(utilisateur.getId(), utilisateur);
    }

    /**
     * Retourne un utilisateur selon son id
     *
     * @param id id utilisateur
     * @return un utilisateur si trouve, sinon null
     */
    public IUtilisateur getUtilisateur(int id){
        return utilisateurMap.get(id);
    }

}
