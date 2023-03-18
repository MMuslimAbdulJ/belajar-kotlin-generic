package app

import data.Function

fun main() {

    val function : Function = Function("Muslim")
    function.sayHello<String>("Eren")
    function.sayHello<Int>(1)

}