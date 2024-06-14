package Introduction/*List﻿
Lists store items in the order that they are added, and allow for duplicate items.

To create a read-only list (List), use the listOf() function.

To create a mutable list (MutableList), use the mutableListOf() function.

When creating lists, Kotlin can infer the type of items stored. To declare the
type explicitly, add the type within angled brackets <> after the list declaration:*/

/* Esto es como un tipo arreglo pero mejorado*/
fun List(){
    // Read only list
    // esta lista no puede ser modificada por que no es mutable
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // Mutable list with explicit type declaration
    // Esta lista puede ser modificada ya que tiene la palabra mutablelistof, es decir
    //se pueden agregar y quitar cosas
    //además puedes agregar <> para especificar el tipo de dato que se usara en la lista
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    /*Para evitar modificaciones no deseadas, puede obtener vistas de solo lectura
    de listas mutables asignándolas a List:*/
    val colors: MutableList<String> = mutableListOf("green", "blue", "red")
    val colorSLoc: List<String> = colors
    println(colorSLoc)

    /*Lists are ordered so to access an item in a list, use the indexed access operator []*/
    /*To get the first or last item in a list, use .first() and .last() functions respectively:*/
    println("The first item in the list is: ${colors[0]} or ${colors.first()}")
    println("The last item in the list is: ${colors[2]} or ${colors.last()}")
    /*.first() and .last() functions are examples of extension functions. To call an extension
    function on an object, write the function name after the object appended with a period .*/

    /*To get the number of items in a list, use the .count() function:*/
    println("This list colors has ${colors.count()} items")

    /*To check that an item is in a list, use the in operator:*/
    println("green" in colors) //me va a dar un true

    /*To add or remove items from a MUTABLE list, use .add() and
    .remove() functions respectively:*/
    colors.add(3, "blue")

    //captura de usuario
    /*var agregarColor : String = ""
    agregarColor = readln()
    colors.add(4, agregarColor)
    println(colors)*/

    // Add "pentagon" to the list
    colors.add("yellow")
    println(colors)

    // Remove the first "pentagon" from the list
    colors.remove("green")
    println(colors)
}