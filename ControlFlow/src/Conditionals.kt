fun Conditionals(){
    /*Expresiones condicionales
    ﻿

    Kotlin proporciona if y when para verificar expresiones condicionales.

    Si tiene que elegir entre if y when, le recomendamos utilizar when,
    ya que conduce a programas más sólidos y seguros.*/

    /* Para usar if, agregue la expresión condicional entre paréntesis ()
    y la acción a realizar si el resultado es verdadero entre llaves {}:*/

    val d: Int
    val check = false
    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)
    // 1

    /*No hay ningún operador ternario condition ? then : else en Kotlin. En cambio, if puede usarse
     como expresión. Si solo hay una línea de código por acción, las llaves {} son opcionales:
     */

    val a = 1
    val b = 2

    println(if (a > b) a else b) // Returns a value: 2

    /*Use when cuando tenga una expresión condicional con múltiples ramas. when Se puede utilizar como
     declaración o como expresión.

    A continuación se muestra un ejemplo de uso when como declaración:

    Coloque la expresión condicional entre paréntesis () y las acciones a realizar entre llaves {}.

    Use -> en cada rama para separar cada condición de cada acción.*/

    val obj = "Hello"

    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }

    val num1: Int = 5
    var num2 = 0
    while (num2 < num1){
        when(num2){
            2 -> println("This will exploded")
            else -> println("Helloword")
        }
        num2++
    }

    /*Tenga en cuenta que todas las condiciones de rama se verifican secuencialmente hasta que se
     cumpla una de ellas. Entonces solo se ejecuta la primera rama adecuada.*/

    /*A continuación se muestra un ejemplo de uso whencomo expresión. La whensintaxis se asigna
    inmediatamente a una variable:*/

    val result = when (obj) { //aquí es cuando asignamos el condicional a una variable
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)
// Greeting
    /*Si whense usa como expresión, la rama else es obligatoria, a menos que el compilador pueda
     detectar que todos los casos posibles están cubiertos por las condiciones de la rama.

    El ejemplo anterior demostró que whenes útil para hacer coincidir una variable. whenTambién es
    útil cuando necesitas comprobar una cadena de expresiones booleanas:*/

    val temp = 18

    val description = when {
        // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
        // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
        // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
        // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }
    println(description)
    // warm


}