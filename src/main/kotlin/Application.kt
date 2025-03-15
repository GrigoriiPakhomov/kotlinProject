package main.kotlin

fun main() {
    val hp = PC("HP", "Pro Desk")

    //Создадим инстанс нащего Notebook
    val mac = Notebook("Apple", "Mac Pro M1")

    //Инстанс телефона
    val iPhone = Phone("Apple", "17")

//    val portables = listOf(mac, iPhone)
//
//    portables.forEach{it.work()}

    val allDevice = listOf(hp, mac, iPhone)

    allDevice.forEach{it.deviseInfo()}

//    hp.installDocker()
//
//    mac.installDocker()

//    val computers = listOf(hp, mac)
//
//    //Вызовется метод Ноутбука. Так проявляется полиморфизм
//    computers.forEach {
//    it.installDocker()
//    }

//    mac.batteryInfo()
//    mac.work()
//    mac.work()
//    mac.work()
//    mac.batteryInfo()
//    mac.charge()
//    mac.batteryInfo()

    //Скоуп функция
//    with(iPhone){// поменяем с мак на фоню
//        batteryInfo()
//        work()
//        work()
//        work()
//        batteryInfo()
//        charge()
//        batteryInfo()
//    }
}