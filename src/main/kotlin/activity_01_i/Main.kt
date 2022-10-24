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
    var end = false

    do {

        logger.info { "PRESS A to add borrower, S to search borrower, and any key to end" }
        val action = readLine().toString()

        if (action == "A") {

            logger.info { "ENTER BORROWERS NAME: " }
            val name = readLine().toString()

            logger.info { "ENTER THE BOOKS BORROWED: " }
            val books = readLine().toString()

            logger.info { "ENTER DATE BORROWED: " }
            val date = readLine().toString()

            logger.info { "ENTER RETURN DATE: " }
            val returnDate = readLine().toString()

            val infos = ("Name: $name, Books: $books, Date: $date, Return Date: $returnDate")

            borrowersList.add(infos)
            logger.info { "$name SUCCESSFULLY ADDED TO BORROWERS LIST WITH ID: ${borrowersList.size-1}" }

        } else if (action == "S") {

            logger.info { "ENTER BORROWER ID: " }
            val search = readLine()!!.toInt()

            if (search < borrowersList.size && search >= 0 ) {
                logger.info { borrowersList[search] }
            } else {
                logger.info { "INVALID ID" }
            }

        } else {
            end = true
        }

    } while (!end)

}
