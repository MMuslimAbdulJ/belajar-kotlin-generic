package app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StringReadWriteLog(var data : String) : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get property with name ${property.name}")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set property with name ${property.name} set to $value")
        data = value
    }
}

class Person(param : String) {
    var nama : String by StringReadWriteLog(param)
}

fun main() {

    val muslim = Person("Muslim")
    println(muslim.nama)
    muslim.nama = "Babang"
    println(muslim.nama)

}