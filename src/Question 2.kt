fun toDouble(input:RationalNumber): Double{
    val double: Double = (input.numerator.toDouble()/input.denominator.toDouble())
    return(double)
}

fun add (inputOne:RationalNumber, inputTwo:RationalNumber): RationalNumber {

    //Numbers
    val num1 = inputOne.numerator
    val den1 = inputOne.denominator
    val num2 = inputTwo.numerator
    val den2 = inputTwo.denominator

    //The math

    var newDen = den1 * den2
    val newNum1 = num1 * den2
    val newNum2 = num2 * den1
    var finalNum = newNum1 + newNum2

    return RationalNumber(finalNum, newDen)

}
