package activity_01_f

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

/*
Create an application that will accept 2 string inputs.

Your application will print all unique characters in both Strings.
*/

fun main() {

    var uniqueChar = mutableSetOf<Char>()
    var indexFirstString = 0
    var indexSecondString = 0
    var unique = false

    logger.info { "TYPE THE FIRST STRING" }
    var firstString: String = readLine().toString()
    logger.info { "TYPE THE SECOND STRING" }
    var secondString: String = readLine().toString()

    if (firstString.length < secondString.length) {
        val holder = firstString
        firstString = secondString
        secondString = holder
    }

    do {
        var char1 = firstString[indexFirstString].lowercaseChar()
        indexFirstString++

        do {
            var char2 = secondString[indexSecondString].lowercaseChar()

            if (char1 == char2) {
                unique = false
                break
            } else {
                unique = true
            }
            indexSecondString++

        } while (indexSecondString < secondString.length)

        indexSecondString = 0

        if (unique) {
            uniqueChar.add(char1)
        }

    } while (indexFirstString < firstString.length)
    logger.info { "UNIQUE CHARACTERS: $uniqueChar" }

}