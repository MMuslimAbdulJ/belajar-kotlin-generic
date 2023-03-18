package app

class Covariant<out T>(val name : T) {

    fun data() : T {
        return name
    }

    // cannot
//    fun setData(param : T) {
//        data = param
//    }

}

fun main() {

    val covariantString : Covariant<String> = Covariant("Muslim")
    val covariantAny : Covariant<Any> = covariantString


    println(covariantAny.data())
}