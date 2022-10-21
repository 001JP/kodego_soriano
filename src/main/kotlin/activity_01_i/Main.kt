package activity_01_i

import mu.KotlinLogging

/*
Using Activity 01 - B, Implement a process where someone can borrow a book.

User: Librarian

Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.

Scope :

Data Structures*/

private val logger = KotlinLogging.logger{}

fun main() {

    val borrowersList = mutableListOf<String>()

    logger.info { "ENTER BORROWERS NAME: " }
    val name = readLine().toString()

    logger.info { "ENTER THE BOOKS BORROWED: " }
    val books = readLine().toString()

    logger.info { "ENTER DATE BORROWED: " }
    val date = readLine().toString()

    logger.info { "ENTER RETURN DATE: " }
    val returnDate = readLine().toString()

    var infos = ("Name: $name, Books: $books, Date: $date, Return Date: $returnDate")

    logger.info { "CONFIRM INFORMATION: $infos" }
    logger.info { "ENTER Y/N" }

    val confirmation = readLine().toString()

    if (confirmation == "Y") {
        borrowersList.add(infos)
        logger.info { "INFO SUCCESSFULLY ADDED TO BORROWERS LIST" }
    } else {
        logger.info { "CANCELLED" }
    }

    logger.info { borrowersList }

}
