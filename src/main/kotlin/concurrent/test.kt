package main.kotlin.concurrent

import kotlin.concurrent.thread


fun main() {
//    val t = MyThread().apply { start() }
//
//    t.join()
//    println(Thread.currentThread().name)
//
//    val t2 = Thread(MyRun()).start()
//
//    val t3 = Thread{
//        println(Thread.currentThread().name)
//    }.start()
//
//    val t4 = thread{
//        println(Thread.currentThread().name)
//    }
//}

    var i = 0
    repeat(500) {
        thread {
            print(" **** ")
            print(" ++++ ")
            print(" ---- ")
            print(" ==== ")
            println(i++)
        }
    }

}
class MyThread : Thread() {
    override fun run() {
        println(Thread.currentThread().name)
    }
}
class MyRun : Runnable {
    override fun run() {
        println(Thread.currentThread().name)
    }
}
