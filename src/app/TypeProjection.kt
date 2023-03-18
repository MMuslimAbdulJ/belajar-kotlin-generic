package app

class Container<T>(var data : T)

fun copy(from : Container<out Any>, to : Container<in Any>) {
    to.data = from.data
}

fun main() {

    val container1 = Container("Muslim")
    val container2 : Container<Any> = Container("Eren")

    copy(container1, container2)

}