package main.kotlin

//Реализует интерфейсы девайс и портейбл
class Phone(override val manufacturer: String, override val model: String, private var battery: Int = 100): Device, Portable {
    override fun work() {
        "working".prettyPrint()
        battery -=  20
    }

    override fun charge() {
        "charning".prettyPrint()//заряжает
        battery = 100
    }

    override fun batteryInfo() {
        "battery $battery".prettyPrint()//текущее состояние батареи
    }
}