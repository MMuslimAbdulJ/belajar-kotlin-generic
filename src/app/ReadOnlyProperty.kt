package app

import javax.naming.Name
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogReadOnlyProperty(val data : String) : ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access propterty ${property.name} with value $data")
        return data.uppercase()
    }
}

class NameWithLog(param : String) {
    val name : String by LogReadOnlyProperty(param)
}


fun main() {
    val muslim = NameWithLog("Muslim")
    println(muslim.name)
    println(muslim.name)
    println(muslim.name)
}