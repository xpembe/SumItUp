import java.util.*

class Calculator {
    // Initializing the scanner object for user inputs
    private val scanner = Scanner(System.`in`)

    // Return the summation of two numbers
    fun add(num1: Double, num2: Double): Double = num1 + num2

    // Returns the difference of two numbers
    fun subtract(num1: Double, num2: Double): Double = num1 - num2

    // Returns the product of two numbers
    fun multiply(num1: Double, num2: Double): Double = num1 * num2

    // Returns the quotient of two numbers
    fun divide(num1: Double, num2: Double): Double = num1 / num2

    // Returns the remainder of two numbers
    fun remainder(num1: Double, num2: Double): Double = num1 % num2

    // Prompting user for number inputs
    fun numberInput(prompt: String): Double {
        print("$prompt: ")
        return scanner.nextDouble()
    }

    // Prompting user for operation to be performed
    fun chooseOperation(prompt: String): String {
        println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Divide\n5. Remainder\n")
        print("$prompt: ")
        val operation = scanner.nextInt()
        return when (operation) {
            1 -> "+"
            2 -> "-"
            3 -> "*"
            4 -> "/"
            5 -> "%"
            else -> ""
        }
    }
}