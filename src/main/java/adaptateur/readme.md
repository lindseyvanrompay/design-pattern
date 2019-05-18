# Pattern adaptateur

## Objectif
On possède 2 objets faisant à peu près la même chose, mais avec des interfaces différentes.

## Résolution : Exemple du controle
On a 3 interfaces de bot. Italien avec parlerItalien(), Anglais et Français. <br>
On veut juste un bot qui parle (1 seule interface commune aux 3)

Pour cela, on va créer une classe adaptateur contenant les méthodes voulues. (Ici : parler)

On va ensuite implémenter cette classe pour chacun des bots. <br>
La classe AdapteurFrançais aura la méthode parler de la classe adaptateur.
qui appelera parlerFrançais() du bot.

# Finalite
3 objets d'interfaces différentes possédant 1 seule interface.
(parlerItalien, parlerAnglais, parlerFrancais) -> Parler()