package main.kotlin

fun main() {
    val list = listOf(1, 2, 3)
    val squared = list.map{it * it}
//    выведет [1, 4, 9]
    println(squared)
// примегяет трансофрмацию с использованием индекса
    val indexed = list.mapIndexed{index, i -> index to i  }
//    выведет [(0, 1), (1, 2), (2, 3)] получим List<Pair<Int,Int>>
    println(indexed)

}