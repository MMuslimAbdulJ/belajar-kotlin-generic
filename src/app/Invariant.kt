package app

class Invariant<T>(val data : T)

fun main() {


    var invariantString : Invariant<String> = Invariant("String")
//    val invariantAny : Invariant<Any> = invariantString
//    invariantString.data = 100

}