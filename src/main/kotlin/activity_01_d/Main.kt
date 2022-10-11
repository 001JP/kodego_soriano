package activity_01_d

/*
Create an application that will accept 5 monetary amounts.



After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.


The total of the 5  input will be divided by the answer in the second question input.


Note: Error checking must be done.
*/

fun main() {

    var monetaryAmount: Int
    var dividedBy: Int = 0
    var result: Double = 0.0
    var amountTotal: Int = 0

    for (i in 1..5) {

        println("Enter the amount: ")
        monetaryAmount = readLine()!!.toInt()

        if (monetaryAmount is Int) {
           amountTotal += monetaryAmount
        } else {
            println("Invalid data type")
        }
    }

    println("Divide the value by how many? ")
    dividedBy = readLine()!!.toInt()
    result = amountTotal/dividedBy.toDouble()
    println(result)

}