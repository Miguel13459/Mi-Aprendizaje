package Introduction

fun Exercise(){
    /*Exercise 1﻿
    You have a list of “green” numbers and a list of “red” numbers.
     Complete the code to print how many numbers there are in total.*/

    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    var number = 0

    number = greenNumbers.count() + redNumbers.count()

    println("The numbers in total are ${greenNumbers.count() + redNumbers.count()}")

    /*You have a set of protocols supported by your server. A user requests to use a
    particular protocol. Complete the program to check whether the requested protocol
    is supported or not (isSupported must be a Boolean value).*/

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
        println("Support for $requested: $isSupported")

    /*Defina un mapa que relacione números enteros del 1 al 3
     con su ortografía correspondiente. Utilice este mapa para deletrear el número dado..*/

    val number2word: MutableMap<Int, String> = mutableMapOf(1 to "One", 2 to "Two", 3 to "three")
    val n = 2
    println("$n is spelt as ${number2word[n]}")
}