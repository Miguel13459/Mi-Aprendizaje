fun Loops (){
    /*La forma más común de crear un rango en Kotlin es utilizar el ..operador. Por ejemplo,
     1..4equivale a 1, 2, 3, 4.

    Para declarar un rango que no incluye el valor final, utilice el ..<operador. Por ejemplo,
     1..<4equivale a 1, 2, 3.

    Para declarar un rango en orden inverso, use downTo.Por ejemplo, 4 downTo 1es equivalente
    a 4, 3, 2, 1.

    Para declarar un rango que se incrementa en un paso que no es 1, use stepy el valor de
     incremento deseado. Por ejemplo, 1..5 step 2equivale a 1, 3, 5.

    También puedes hacer lo mismo con Charlos rangos:

    'a'..'d'es equivalente a'a', 'b', 'c', 'd'

    'z' downTo 's' step 2es equivalente a'z', 'x', 'v', 't'*/

    /*****Bucles******/
    /*Las dos estructuras de bucle más comunes en programación son fory while. Úselo forpara
    iterar sobre un rango de valores y realizar una acción. Se utiliza whilepara continuar
    una acción hasta que se cumpla una condición particular.

    For
    Utilizando sus nuevos conocimientos sobre rangos, puede crear un forbucle que repita los
    números del 1 al 5 e imprima el número cada vez.

    Coloque el iterador y el rango entre paréntesis ()con la palabra clave in. Agregue la
    acción que desea completar entre llaves {}:*/

    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print(number)
    }

    var num1 = 5
    var num2 = 0
    for (number in num2..<num1) {
        // number is the iterator and 1..5 is the range
        when(number){
            2 -> print("\nHelado de vainilla")
            else -> print("\nboneles")
        }
        num2++
    }
    println("\n")
    /*Collections can also be iterated over by loops:*/
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    val vegetables = mutableListOf("Corn")
    num2 = 0

    for (vegtbls in num2..num1) {
        when(vegtbls){
            1 -> vegetables.add("Tomato")
            2 -> vegetables.add("Pumpkin")
            3 -> vegetables.add("Eggplant")
            4 -> vegetables.add("Broccoli")
            5 -> vegetables.add("Yam")
            else -> null
        }
        println("Oh no! I hate ${vegetables.get(num2)}!")
        num2++
    }

    /*val veg = mutableListOf("Corn")
    val num3 = 5

    for (i in 0 until num3) {
        val newVegetable = when(i) {
            0 -> "Tomato"
            1 -> "Pumpkin"
            2 -> "Eggplant"
            3 -> "Broccoli"
            4 -> "Yam"
            else -> null
        }

        newVegetable?.let {
            veg.add(it)
            println("Oh no! I hate $it!")
        }
    }*/

    println(vegetables)

    /*While
    while can be used in two ways:*/

    /*
    -Ejecutar un bloque de código mientras una expresión condicional es verdadera. ( while)
    -Para ejecutar el bloque de código primero y luego verificar la expresión condicional.
     ( do-while)

    En el primer caso de uso ( while):

    -Declare la expresión condicional para que su bucle while continúe entre paréntesis ().
    -Agregue la acción que desea completar entre llaves {}.*/
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    /*
    En el segundo caso de uso ( do-while):

    * Declare la expresión condicional para que su bucle while continúe entre paréntesis ().
    * Defina la acción que desea completar entre llaves {}con la palabra clave do.*/

    var cakesEaten2 = 0
    var cakesBaked = 0
    while (cakesEaten2 < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten2)
}
