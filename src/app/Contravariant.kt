package app

class Contravariant<in T> {

    fun sayHello(param : T) {
        println("Hello $param")
    }

    // tidak boleh
//    fun getData() : T {
//        return data
//    }

}

fun main() {

    val contravariantAny : Contravariant<Any> = Contravariant()
    val contravariantString : Contravariant<String> = contravariantAny
    contravariantString.sayHello("Muslim")

//    contravariantString.getData() //error
}