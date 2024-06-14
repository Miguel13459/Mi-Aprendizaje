package ControlFlow

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
}