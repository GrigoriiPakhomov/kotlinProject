package main.kotlin

//Наследуется от класса PC. При наследовании должны вызвать конструктор базового класса. В скобках задаем свойства класса
//Добавили реализацию Portable
//int = 100 это дефолтное значение
class Notebook(override val manufacturer: String, override val model: String, private var battery:Int = 100): PC(manufacturer, model), Portable {

    //Переопределим метод установки докера на мак
    override fun installDocker() {
        "download & install DockerDesktop".prettyPrint()
    }

    override fun work() {
        "working".prettyPrint()//работает
        battery -= 10
    }

    override fun charge() {
        "charning".prettyPrint()//заряжает
        battery = 100
    }

    override fun batteryInfo() {
        "battery $battery".prettyPrint()//текущее состояние батареи
    }
}