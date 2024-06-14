package Introduction

fun valVar(){
    /*All programs need to be able to store data, and variables help you to do just that. In Kotlin,
    you can declare:
    read-only variables with val
    mutable variables with var
    To assign a value, use the assignment operator =.*/

    //read-only variables with val

    //mutable variables with var

    val popcorn = 5    // There are 5 boxes of popcorn
    val hotdog = 7     // There are 7 hotdogs
    var customers = 10 // There are 10 customers in the queue
    var result = 0
    // Some customers leave the queue
    customers = 8
    result = popcorn + hotdog

    println(customers)
    println(result)
    //812


    println("There are $customers customers\n") // There are 10 customers
    // tú puedes poner ${} para agregar algun otro valor o suma de operación en la oración
    println("There are ${customers + 1} customers") // There are 10 customers

    /*practice*/

    val name = "Mary"
    val age = 20
    val conc = "$name is $age years old"
    println(conc)

    val custom = 10
    println("There are $customers customers\n") // There are 10 customers
    // tú puedes poner ${} para agregar algun otro valor o suma de operación en la oración
    println("There are ${customers + 1} customers") // There are 10 customers

    /***practice***/

    println(conc)

}