# Pattern Etat V1

## But 
```text
Créer un automate passant de l'état A à B. 
V1 car l'automate ne peut suivre qu'un seul chemin prédéfini.

```

## Exemple 
On reprend l'exemple du controle : On a un feu tricolore. Chaque couleur doit se suivre 
vert - jaune - rouge. De plus, les timers entre les feux sont différents.

# Resolution
On commance par créer une classe Feu. Celle ci doit posséder un etat (rouge, vert, jaune) 
Ils sont representés ici par FeuRouge, FeuJaune et FeuVert.<br>

__CLASSE ETAT (FeuRouge, FeuVert, FeuJaune)__

```
Les Etats doivent pouvoir passer à l'état suivant. (implémente l'interface Etat et la méthode prochainEtat).

Pour cela, l'état stocke un FeuContext lors de sa création, et change son état et son timer lorsque
prochainEtat() est appelé.
```

__CLASSE FEU (Feu)__
```
La classe principale (Feu) va implementer la classe FeuContext pour que ses filles puissent 
changer l'état de la classe mère. (méthode setEtat() et setTimer() )

Les feux doivent fonctionner en même temps. -> Extends Thread, ou ici, Runnable

```

__CLASSE MAIN__
```text
On va créer 3 feux. Chacun initialisé à un etat Vert. On créer des Threads pour chacun que l'on va lancer avec start().
start() va lancer run() du thread. run() va lancer le timer. (donné au controle)

        try {
            while (true) {
                Thread.sleep(timer);
                prochainEtat();
            }
            
prochainEtat va appeler dans la classe Feu monEtat.prochainEtat(). monEtat.prochainEtat() va modifié l'état du parent et changer la variable timer.

```
## Warning
1) Si on veut faire commencer les feux dans un etat different, il y a une dépendence récurcive <br>
Le FeuContext voudra un état et l'état voudra un FeuContext.
Autant passer un argument null dans un des 2 puis l'initialiser via un Setter. <br>

Autre solution plus propre, pas toujours pratique (par exemple ici avec le timer): La classe parent peut aussi faire monEtat = monEtat.prochainEtat();, 
faisant que la classe fille n'a plus à connaitre la classe mère.


2) Comment synchroniser les feux ? Je sais plus.