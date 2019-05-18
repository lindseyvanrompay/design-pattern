#Pattern Command (Behavior pattern)

##But 
Simply put, the pattern intends to encapsulate in an object
<br> 
all the data required for performing a given action  (site : Baeldung)

FR : Premet au client de stocker des actions pré-faite afin de les appeler facilement. <br>
Cela permet par exemple de faire une télécommande ou l'on stocke des actions facilement appelable. <br>
On peut créer alors un historique des commandes appelées.


##Exemple
Une télécommande va ici être programmée. Pour cela nous aurons : <br>
```
    - Un Main 
    
    - Une télécommande : Celle ci va stocker les commandes (interface avec execute et undo)
    ainsi qu'un historique de celles ci dans une liste.
    
    - Des commandes : Stocke les objets necessaire à leurs actions pour qu'on puisse simplement
    appeler l'action execute() effectuant l'action voulu;
    
    - Des objets (lampe, TV)
```

