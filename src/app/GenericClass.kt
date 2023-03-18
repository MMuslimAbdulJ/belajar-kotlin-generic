package app

import data.MyData

fun main() {

    val data1 : MyData<String, Int> = MyData<String, Int>("Muslim", 100)
    data1.getData()
    data1.getSecond()
    data1.printData()

    val data2 = MyData(100, "Muslim")
    data2.getData()
    data2.getSecond()
    data2.printData()

}