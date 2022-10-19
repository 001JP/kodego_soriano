package activity_01_g

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

/*Create an application that will accept 1 string.

Your application will print “Palindrome” if the string is a palindrome.

Scope :

String

Loops*/

fun main() {

    var charChecker: Int = 0
    var result = false

    logger.info { "ENTER A WORD TO CHECK IF IT'S A PALINDROME" }
    val palindromeOrNot: String = readLine().toString()

    for (char in palindromeOrNot.length-1  downTo 0) {

        result = palindromeOrNot[char] == palindromeOrNot[charChecker]

        if (!result) {
            break
        }
        charChecker++

    }

    if (result) {
        logger.info { "$palindromeOrNot IS A PALINDROME" }
    } else {
        logger.info {"$palindromeOrNot IS NOT A PALINDROME"}
    }
}
