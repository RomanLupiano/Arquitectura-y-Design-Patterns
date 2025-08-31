# Candy 
Se desea implementar el control de tableros de un juego de Golosinas (similar al Candy Crush). 
Cada ficha del tablero posee una fortaleza (golpes necesarios para destruirla), ocupa
un espacio del tablero (medido en cantidad de casilleros), y tiene un poder de destrucción.
Por ejemplo el “chocolate” tiene una fortaleza de 1, ocupa 1 casillero del tablero y tiene poder
de destrucción 0; la “piedra” tiene fortaleza 6, ocupa 1 casillero de tablero y tiene poder de
destrucción 0; el “caramelo a rayas” ocupa 1 casillero del tablero, tiene fortaleza 1, y un poder
de destrucción de 10; la “torta” ocupa 4 casilleros, tiene fortaleza 8 y poder de destrucción
4, y así con cada una de las distintas fichas. También existen fichas especiales cuyo poder de
destrucción se calcula como la fortaleza de la ficha, dividido el espacio que ocupan.  

Un tablero posee un puntaje mínimo que es necesario alcanzar para pasar al siguiente nivel,
una lista de fichas, la dificultad del mismo (se calcula como la sumatoria de todas las fortalezas
de las fichas, dividido la sumatoria del poder de destrucción de todas las fichas).  

En cada tablero, se debe poder buscar:
- Todas las fichas que posean un poder de destrucción mayor a 2
- Todas las fichas que ocupen más de 4 lugares
- Todas las fichas que tengan una fortaleza mayor a 5
- Combinaciones lógicas de los anteriores