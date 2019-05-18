# Pattern Etat V2

## Difference Etat V1
Dans ce cas-ci, on peut demander directement à un etat d'aller à n'importe quel autre état. <br>
Dans cette exemple, les états A,B,C,D peuvent aller 2 état plus loin.
Exemple : 
```
    - A peut aller à B ou C
    - B peut aller à C ou D
    - C peut aller à D ou A
    - D peut aller à A ou B
```
