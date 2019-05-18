package singleton.modele;

public class Utilisateur implements IUtilisateur{
    // Une variable static est une variable partage par les objets d'une meme classe
    // Si on prend 2 utilisateurs, ils auront toujours le même idIncr.
    // On peut s'en servir pour creer un id unique a chaque instanciation
    private static int idIncr=0;
    private int id;

    private String nom;

    public Utilisateur(String nom){
        id = idIncr++;
        this.nom = nom;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNom() {
        return nom;
    }


}
