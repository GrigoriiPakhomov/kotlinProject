package main.kotlin

class Calculator {
    fun add(a: Double, b: Double) = a + b
}

class CalculatorService(private val calc: Calculator) {
    fun executeOperation(nameOperation: String, a: Double, b: Double) = calc.add(a,b)
}