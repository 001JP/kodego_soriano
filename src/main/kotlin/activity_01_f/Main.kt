package activity_01_f

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

/*
Create an application that will accept 2 string inputs.

Your application will print all unique characters in both Strings.
*/

fun main() {

    logger.info { "TYPE THE FIRST STRING" }
    val firstString: String = readLine().toString()
    logger.info { "TYPE THE SECOND STRING" }
    val secondString: String = readLine().toString()

    logger.info { "THE FIRST STRING IS:" }
    for (i in firstString) {
        logger.info { i }
    }

    logger.info { "THE FIRST SECOND IS:" }
    for (i in secondString) {
        logger.info { i }
    }
}