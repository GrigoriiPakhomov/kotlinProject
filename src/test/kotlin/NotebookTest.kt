package test.kotlin

//import org.testng.annotations.Test
import main.kotlin.Notebook
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class NotebookTest {

    @Test
    fun`когда ноутбук работает, уровень заряда должен уменьшаться на 10`() {
        val notebook = Notebook("Huawey", "Matebook")

        notebook.work()

        assertEquals(90, notebook.batteryInfo())
    }
}