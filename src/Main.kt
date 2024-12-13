fun main() {
    // Initializing the calculator object for calculations
    val calculator = Calculator()

    // Taking the inputs from the user and store them
    val operation = calculator.chooseOperation("Choose operator")
    val firstNumber = calculator.numberInput("Enter a first number")
    val secondNumber = calculator.numberInput("Enter a second number")

    // Choosing the operation to be performed
    val result = when (operation) {
        "+" -> calculator.add(firstNumber, secondNumber)
        "-" -> calculator.subtract(firstNumber, secondNumber)
        "*" -> calculator.multiply(firstNumber, secondNumber)
        "/" -> calculator.divide(firstNumber, secondNumber)
        "%" -> calculator.remainder(firstNumber, secondNumber)
        else -> "Invalid Operation"
    }

    // Displaying the formatted result
    println("\nResult: $result")
}