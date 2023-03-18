package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(data : T) : ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change value from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change value from $oldValue to $newValue")
    }
}

class Car(brand : String, year : Int) {
    var brand : String by LogObservableProperty<String>(brand)
    var year : Int by LogObservableProperty<Int>(year)
    var owner : String by Delegates.notNull<String>()
    var description : String by Delegates.vetoable(""){ property, oldValue, newValue ->
        println("Before change value from $oldValue to $newValue")
        true
    }
    var other: String by Delegates.observable("") { property, oldValue, newValue ->
        println("After change $property value from $oldValue to $newValue")
    }
}

fun main() {
    val mobil1 = Car("Toyota", 2020)
    mobil1.brand = "Honda"
    println(mobil1.brand)

    mobil1.year = 2023
    println(mobil1.year)

    mobil1.description = "Desc"
    println(mobil1.description)

    mobil1.owner = "Muslim"
    println(mobil1.owner)

    mobil1.other = "Other"
    println(mobil1.other)
}