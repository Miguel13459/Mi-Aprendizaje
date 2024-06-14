package Introduction/*Set﻿
Mientras que las listas están ordenadas y permiten elementos duplicados,
 los conjuntos están desordenados y solo almacenan elementos únicos .

To create a read-only set (Set), use the setOf() function.

To create a mutable set (MutableSet), use the mutableSetOf() function.

Al crear conjuntos, Kotlin puede inferir el tipo de elementos almacenados. Para declarar
 el tipo explícitamente, agregue el tipo entre corchetes angulares <>después de la declaración
  del conjunto:
 */
fun Set(){
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit) //aqui va a quitar una cherry por que está duplicado
    // [apple, banana, cherry]

    val fruitLocked: Set<String> = fruit
    println(fruitLocked)

    /*Para obtener la cantidad de elementos en un conjunto, use la .count()función:*/
    println("This set has ${readOnlyFruit.count()} items")

    /*Para comprobar que un artículo está en un conjunto, utilice el operador "in":*/
    println("banana" in readOnlyFruit)

    /*Para agregar o eliminar elementos de un conjunto mutable, use .add()y .remove()
    funciones respectivamente:*/
    fruit.add("dragonfruit")
    fruit.add("grape")
    fruit.add("orange")// Add "dragonfruit" to the set
    println(fruit)

    fruit.remove("apple") // Remove "apple" from the set
    println(fruit)
}