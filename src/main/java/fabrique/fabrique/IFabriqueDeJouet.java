package fabrique.fabrique;

import fabrique.Jouet.Jouet;

public interface IFabriqueDeJouet {
    public static enum Type {JOUET_ROBOT, JOUET_CHIEN};

    Jouet fabriquerJouet(FabriqueDeJouet.Type type);
}
