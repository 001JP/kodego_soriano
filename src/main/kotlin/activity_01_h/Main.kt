package activity_01_h

import mu.KotlinLogging

/*
Create an application that will accept 2 Integers.

It will identify the lower value and bigger value of the two inputs.

Then, your application will print all the prime numbers starting from the lower number up to the largest number.

Scope :

String

Loops



Input:

1, 4 -> 1, 2, 3

10 -> 1, 2, 3, 5, 7
*/

private val logger = KotlinLogging.logger{}

fun main() {

    val primeNumbers = mutableSetOf<Int>()

    logger.info { "ENTER THE FIRST INTEGER" }
    var firstInt = readLine()?.toIntOrNull()

    logger.info { "ENTER THE SECOND INTEGER" }
    var secondInt = readLine()?.toIntOrNull()

    if (firstInt!! > secondInt!!) {
        val holder = secondInt
        secondInt = firstInt
        firstInt = holder
    }

    for (number in firstInt..secondInt) {

        if (number == 2 || number == 3 || number == 5 || number == 7) {
            primeNumbers.add(number)
        } else if (number%2 != 0 && number%3 != 0 && number%5 != 0 && number%7 != 0) {
            primeNumbers.add(number)
        }

    }

    logger.info { "PRIME NUMBERS: $primeNumbers" }

}