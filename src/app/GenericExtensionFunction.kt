package app

class Data<T>(val data : T)

fun Data<String>.print() {
    val data = this.data
    println(data)
}

fun Data<Int>.printInt() {
    val data = this.data
    println(data)
}


fun main() {
    val data1 = Data("Muslim")
    val data2 = Data(1)

    data1.print()
//    data2.print() //error
    data2.printInt()
}