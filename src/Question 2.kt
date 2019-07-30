fun toDouble(numerator: Int, denominator: Int): Double{
    val double: Double = (numerator.toDouble()/denominator.toDouble())
    return(double)
}

fun add (numerator: Int, denominator: Int, numerator2: Int, denominator2: Int): rationalNumber {
    val x = denominator
    val z = denominator2
    val y = z
    val a = y/x
    val b = numerator * a
    val numeratorFinal = b + numerator2
    val denominatorFinal = y
    return rationalNumber (numeratorFinal, denominatorFinal)
    }
