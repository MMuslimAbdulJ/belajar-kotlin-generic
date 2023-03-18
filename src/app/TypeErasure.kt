package app

import java.lang.reflect.Type

class TypeErasure<T>(param : T) {
    private val data : T = param
    fun getData() : T = data
}

fun main() {
    val data1 : TypeErasure<String> = TypeErasure("Muslim")
    val dataString = data1.getData()
    println(dataString)

//    val data2 : TypeErasure<Int> = data1 as TypeErasure<Int>
//    val dataInt = data2.getData() // error konversi
//    println(dataInt)

}