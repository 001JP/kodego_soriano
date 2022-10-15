package activity_01_d

/*
Create an application that will accept 5 monetary amounts.



After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.


The total of the 5  input will be divided by the answer in the second question input.


Note: Error checking must be done.
*/

fun main() {

    var amountTotal: Int = 0
    var result: Int = 0
    var finished = true

    for (i in 1..5) {
        println("ENTER THE AMOUNT $i: ")
        var amount = readLine()?.toIntOrNull()

        if (amount != null) {
            amountTotal += amount
        } else {
            println("USE NUMBERS ONLY")
            finished = false
            break
        }
    }

    if (finished) {

        println("Divide the value by how many? ")
        var dividedBy = readLine()?.toIntOrNull()

        if (dividedBy != null) {
            result = amountTotal/dividedBy
            println("Result is $result")
        } else {
            println("USE NUMBERS ONLY")
        }
    }
}