package main.kotlin

interface Device {
    //Характиристики производитель
    val manufacturer: String

    val model: String

    fun deviseInfo() = "info about device".prettyPrint()

    //Реализуем функцию расширения для класса String
    fun String.prettyPrint(){
        println("manufacturer: '${manufacturer}' model '${model}':")
        println(this)
        println()
    }
}