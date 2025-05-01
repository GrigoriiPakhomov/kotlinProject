package main.kotlin.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class c {

}

fun  main() = runBlocking{
    val job = launch { doWorld() }
    println("Hello, ")
}

suspend fun doWorld() {
    delay(1000L)
    println("World!")
}