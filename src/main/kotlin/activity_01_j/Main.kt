package activity_01_j

import mu.KotlinLogging

//Implement a process where items are added to the grocery cart.
//
//User : Cashier
//
//Goal : List of Items bought, how many items were bought and total cost.
//
//Scope :
//
//Data Structures

private val logger = KotlinLogging.logger{}

fun main() {

    val items = mutableListOf<String>()
    val quantity = mutableListOf<Int>()
    val cost = mutableListOf<Double>()
    var total = 0.00

    do {
        logger.info { "ENTER ITEM NAME: " }
        val itemName =readLine().toString()

        logger.info { "ENTER $itemName QUANTITY: " }
        val itemQuantity = readLine()?.toInt()

        logger.info {"ENTER $itemName PRICE: "}
        val itemPrice = readLine()?.toDouble()

        total += (itemPrice!! * itemQuantity!!)

        items.add(itemName)
        quantity.add(itemQuantity)
        cost.add(itemPrice)

        logger.info { "ADD ANOTHER ITEM? Y/N" }
        val confirmation = readLine().toString()

    } while (confirmation == "Y")


    for (i in items.indices) {

        logger.info { "ITEM: ${items[i]}, QTY: ${quantity[i]}, PRICE: ${cost[i]}" }

    }

    logger.info { "TOTAL: $total" }
}