# Pattern Singleton

##But

N'avoir qu'une instance d'un objet

## Exemple
Le modèle ici est composé de 2 classes principales, BddUtilisateurSingleton et Utilisateur. <br>

La classe BddUtilisateur possède un constructeur privé (empeche les autres classes de l'appeler).
Pour l'instancier, il faut passer par une méthode static qui controle la création de l'objet.


## Danger 
1) L'accès à ClasseStatic.getInstance() n'est pas à SPAMMER. Il faut mieux juste l'appeler au départ
puis la passer en argument. 

2) Dans cette version simple du singleton, il y a un risque. Si 2 classes passent par if(mon instance = null)
, les 2 vont ensuites créer une nouvelle instance.