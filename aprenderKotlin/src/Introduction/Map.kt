package Introduction

/*Los mapas almacenan elementos como pares clave-valor. Se accede al valor haciendo
 referencia a la clave. Puedes imaginar un mapa como un menú de comida. Puede
 encontrar el precio (valor) al encontrar el alimento (clave) que desea comer.

 Los mapas son útiles si desea buscar un valor sin utilizar un índice numerado,
   como en una lista.

-Cada clave en un mapa debe ser única para que Kotlin pueda entender qué valor desea obtener.

-Puede tener valores duplicados en un mapa.
   */

fun Map (){

    /*To create a read-only map (Map), use the mapOf() function.
To create a mutable map (MutableMap), use the mutableMapOf() function.

When creating maps, Kotlin can infer the type of items stored. To declare
the type explicitly, add the types of the keys and values within angled
brackets <> after the map declaration. For example: MutableMap<String,
Int>. The keys have type String and the values have type Int.

The easiest way to create maps is to use to between each key and its related value:*/
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100, "grape" to 40)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}

    /*Para evitar modificaciones no deseadas, obtenga vistas de solo lectura
     de mapas mutables transmitiéndolos a Map:*/
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    /* Para acceder a un valor en un mapa, utilice el operador de acceso indexado
     [] con su clave:*/
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    println("${readOnlyJuiceMenu["grape"]}")

    val age = 18
    val name = "Miguel"
    val nameAge: MutableMap<String, Int> = mutableMapOf(name to age)
    println(nameAge)

    // The value of apple juice is: 100

    /*Para obtener la cantidad de elementos en un mapa, use la .count()función:*/
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
    // This map has 3 key-value pairs

    val num = 300
    val fru = "Melon"
    val num2 = 120
    val fru2 = "Pineapple"
    /*Para agregar o eliminar elementos de un mapa mutable, use .put()y .remove()
    funciones respectivamente:*/
    juiceMenu.put("coconut", 150) // Add key "coconut" with value 150 to the map
    juiceMenu.put(fru, num)
    juiceMenu.put(fru2, num2)
    println(juiceMenu)

    // {apple=100, kiwi=190, orange=100, coconut=150}

    juiceMenu.remove("kiwi")
    juiceMenu.remove(fru)// Remove key "orange" from the map
    println(juiceMenu)
    // {apple=100, kiwi=190, coconut=150}

    /*Para comprobar si una clave específica ya está incluida en un mapa,
    utilice la .containsKey()función:*/
    println(readOnlyJuiceMenu.containsKey("kiwi"))
    /*Para obtener una colección de las claves o valores de un mapa, use las
    propiedades keysy valuesrespectivamente:*/
    println(readOnlyJuiceMenu.keys)
    // [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values)
    // [100, 190, 100]



    /*keysy valuesson ejemplos de propiedades de un objeto. Para acceder a la
    propiedad de un objeto, escriba el nombre de la propiedad después del objeto
    añadido con un punto.*/
    /*Para comprobar que una clave o valor está en un mapa, utilice el inoperador :*/
    println("orange" in readOnlyJuiceMenu.keys)
    // true
    println(200 in readOnlyJuiceMenu.values)
    // false
}