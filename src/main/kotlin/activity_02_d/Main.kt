package activity_02_d

/*
Implement Activity 01 - D using data structure.

Create an application that will accept 5 monetary amounts.

After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.

The total of the 5  input will be divided by the answer in the second question input.

Note: Error checking must be done.*/


fun main() {

    var amountsEntered = mutableListOf<Int>()
    var result = 0
    var finished = true

    for (i in 1..5) {
        println("ENTER THE AMOUNT $i: ")
        val amount = readLine()?.toIntOrNull()

        if (amount != null) {
            amountsEntered.add(amount)
        } else {
            println("USE NUMBERS ONLY")
            finished = false
            break
        }
    }

    if (finished) {

        println("Divide $amountsEntered by how many? ")
        val dividedBy = readLine()?.toIntOrNull()

        if (dividedBy != null) {
            result = (amountsEntered.sum())/dividedBy
            println("Result is $result")
        } else {
            println("USE NUMBERS ONLY")
        }
    }
}