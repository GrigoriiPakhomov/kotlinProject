package test.kotlin

import io.mockk.every
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import io.mockk.slot
import main.kotlin.Calculator
import main.kotlin.CalculatorService
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.Test
import kotlin.test.assertEquals


@ExtendWith(MockKExtension::class)
class CalculatorServiceTest {

    val slotA = slot<Double>()
    val slotB = slot<Double>()

    @Test
    fun `calc service shold a and b`() {
        val calculator = mockk<Calculator>()
        every { calculator.add(capture(slotA), capture(slotB)) }returns 5.0
        val calculatorService = CalculatorService(calculator)
//Секция вызова
        val result = calculatorService.executeOperation("add", 2.0, 3.0)
//        Секция проверки
        assertEquals(2.0, slotA.captured)
        assertEquals(3.0, slotB.captured)
        assertEquals(5.0, result)
    }
}