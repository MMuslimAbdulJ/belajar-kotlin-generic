package app

//open class Employee
//
//class VicePresident : Employee()
//
//class Company<T: Employee>(val Employee : T)
//
//fun main() {
//
//    val data1 = Employee()
//    val data2 = VicePresident()
//    val company1 = Company(data1)
//    val company2 = Company(data2)
//
//}

interface CanSayHello {
    fun sayHello(name : String)
}

open class Employee

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

class Company<T>(val Employee : T) where T : Employee, T : CanSayHello

fun main() {

    val data1 = Employee()
    val data2 = VicePresident()
    val company1 = Company(VicePresident())
    val company2 = Company(data2)
//    val company3 = Company("String")

}