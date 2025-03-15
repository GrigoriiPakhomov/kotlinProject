package main.kotlin

class Arrays {
    fun immutableListConstruction(){
        val immutableList = listOf("This", "is", "SPARTA")
//        после создания такого списка мы больше не можем добавить в него новые элементы
        println(immutableList.joinToString(separator = " "))
//        выведет "This is SPARTA"

        println(immutableList[0])
// выведет первый элемент списка
        println(immutableList.get(0))
    }

    fun test(){
        val list = mutableListOf<Any>()
        list += "String"
        println(list[0])

    }

    fun mutableListConstruction(){
        val mutableList = mutableListOf("This", "is", "Sparta")
//        можем добавлять новые элементы
        mutableList.add(0, "is")
//        а также изменять существующие
        mutableList[mutableList.lastIndex] = "Sparta?"
//        и удалять их
        mutableList.removeAt(2)
        println(mutableList.joinToString(separator = " "))
    }
}