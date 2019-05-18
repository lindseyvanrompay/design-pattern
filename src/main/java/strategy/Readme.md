# Pattern strategy
## But

Le pattern **Strategy** permet à un objet de changer de comportement en 1 appel méthode.

## Résolution : Exemple
Dans cet exemple : <br>
La classe Canard est la classe mère. Elle doit savoir voler. 

Pour cela, elle possède un objet de type VolerStrategy. 
Lorsque le canard appelle une méthode de son interface, il relèguera l'appel à son objet.

## Finalité
On peut changer le comportement de vol du canard juste en remplaçant l'objet avec un autre objet implémentant stratégie.

Parfois, on peut utiliser les lambdas. Les lambda permettent de remplacer les **interfaces fonctionnelles** (Interface avec 1 seule méthode).

VolerStrategy est une interface fonctionnelle. On peut donc juste faire : 
```
canard.setVolerStrategy( () -> comportement; )
Ou si il y a des arguments :
canard.setVolerStrategy( (x) -> comportement; )
```
