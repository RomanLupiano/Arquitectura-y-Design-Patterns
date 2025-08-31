# Congreso de Aritmética
En un congreso de Aritmética decidieron utilizar un sistema para organizar sus expresiones matemáticas.  
Las expresiones con las que trabajan son expresiones básicas, que incluyen suma, resta, producto, división, potencia y raíz.  
Por ejemplo:  
- ((2+3)*5)
- (5+5)(3-1)
- ((7+8) / (5-3))  

Luego de muchas discusiones se pusieron de acuerdo en qué es lo que querían que el sistema fuera capaz de proveer:
- a) Obtener el valor de la expresión: en los ejemplos anteriores, serían 25; 100; 7,5 respectivamente  
- b) Obtener una lista con sólo los números de la expresión: en los ejemplos serian  
[2,3,5]; [5,5,3,1]; [7,8,5,3]  
- c) Obtener una lista con sólo los operadores de la expresión: en los ejemplos serian  
[+,*]; [+,pot, -]; [+,/,-]
- d) Imprimir fácilmente las expresiones, por ello quieren que poder obtener un String con la expresión propiamente dicha incluyendo los paréntesis  
“((2+3)*5)”; “(5+5)(3-1)”; “((7+8) / (5-3))”.  

Adicionalmente, el sistema debe ser capaz de retornar el cálculo opuesto de una expresión.
Esto quiere decir, si la expresión es una suma, el cálculo opuesto hace la resta, si es un
producto hace la división, si es una potencia hace la raíz cuadrada, y así con cada operador.
Por ejemplo, en la primera expresión presentada el cálculo opuesto sería ((2-3)/5) es decir -
0,2. En el segundo ejemplo, el cálculo opuesto sería 3+15−5 es decir 0. En el tercer ejemplo,
el cálculo opuesto sería ((7-8) * (5+3)), es decir -8.  

Los matemáticos desean realizar un mecanismo en el cual sea posible “normalizar” los valores
de una expresión, es decir si tenemos la expresión (4+5) y se la normaliza dividiendo con el
valor 10 la expresión resultante sería (0,4 + 0,5). Si se la normaliza con el valor 2, la expresión
resultante sería (2 + 2,5) . Para realizar esta operación, se genera una expresión nueva y la
original no se modifica. La expresión generada debe respetar la misma estructura de la
expresión original. También es factible normalizar aplicando primero una corrección (suma o resta) y 
luego una raíz cuadrada. Por ejemplo si la corrección es suma 2 y luego raíz cuadrada
la expresión resultante sería (2,449489743 + 2,645751311). Es factible además aplicar
cualquier combinación de operaciones matemáticas.  

Finalmente, se debe incorporar la capacidad de generar una copia de una expresión. Cuando
se duplica una expresión se realiza una copia de todos los elementos contenidos en ella.
Implementar la solución al problema del organizador de expresiones en JAVA, tener en
cuenta todos los conceptos vistos en clase. Prestar especial atención a la abstracción de
funcionalidad.  

## Análisis de Patrones de diseño:  
El patrón estructural es Composite  
> Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.  

getCopia() en la clase Termino está implementado como un Template Method:
Define el "esqueleto" del algoritmo de copia: crea un "cascarón", copia las subexpresiones (exp1, exp2) y las asigna. La estructura está fija, pero delega un paso del algoritmo a las subclases: el método getCascaron().  
> Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.


getCascaron() es un Factory Method:
Es un método abstracto en la clase Termino que las subclases (Sum, Sub) implementan devolviendo el objeto adecuado. getCascaron() se encarga de decidir qué objeto concreto instanciar.  
> Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.


## Nuevo requerimiento (Solución 2)
Se puede imprimir en notacion polaca, polaca inversa o sin parentesis, o nuevos formatos que aparezcan.
Podemos usar Strategy para hacer que el algoritmo de impresión sea más flexible.  
> Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
Ahora las Expresiones tienen un método formatear que recibe una estrategia de formateo y deja que ésta ultima decida la manera en que se imprima.


## Nuevo requerimiento (Solución 3)
La solución desarrollada permite obtener la opuesta de una expresion devolviendo una expresion totalmente nueva.  
Sin embargo, si tuvieramos una expresión muy extensa en un dispositivo más limitado no podríamos crear tantas copias libremente.  
Una alternativa es que cuando se calcula la opuesta se modifica la expresion original para evitar la creación/destrucción de objetos.  
Podemos volver a usar el Strategy para poder intercambiar operadores más librementes sin necesidad de crear tantos Sums, Subs, etc.


## Nuevo requerimiento (Solución 4)
Los algoritmos de cálculo (listar números, evaluar, etc..) no se conocen a priori o pueden aparacer mas y se deben poder agregar sin modificar le jerarquia de expresiones.
Podemos usar Visitor para agregar más algoritmos de manera exterior a nuestras clases.
> Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.




