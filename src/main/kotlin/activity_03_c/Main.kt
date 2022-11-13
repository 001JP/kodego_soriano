package activity_03_c

/*
Covered Topic(s) : Functions



Instructions :



1. Create an ArrayList of grocery products with 20 entries.

2. Create a HashMap called Cart.

Hint:  Hashmap<String, Int>

2. Create a function "addToCart" that will accept a String and an Int, the int will add the input in the Hashmap. If the Entry already exists, create a new entry in the HashMap.

Hint : you may add a "_01", "_02"
Example Coke_01, Coke_02

3. Create a function "checkOut". This will compute how many items have been checked out.

4. Create a function "removeFromCart"  that will accept a String and remove the input from the Hashmap. If there are multiple*/


val products = arrayListOf<String>(
    "Cooking oil",
    "Butter",
    "Salt",
    "Sugar",
    "Eggs",
    "Milk",
    "Onion",
    "Garlic",
    "Tomatoes",
    "Rice",
    "Soy sauce",
    "Vinegar",
    "Coffee",
    "Juice",
    "Biscuits",
    "Ketchup",
    "Bread",
    "Calamansi",
    "Noodles",
    "Tomato sauce"
)

val cart = HashMap<String, Int>()


fun main() {

    addToCart(products[0], 1)
    addToCart(products[9], 5)
    addToCart(products[19], 1)
    addToCart(products[0], 3)

    println(cart)
    removeFromCart(products[0])
    removeFromCart("Cooking oil_1")
    println(cart)
    println(checkOut())

}


fun addToCart(product: String, amount: Int) {

    if (cart.containsKey(product)) {
        var newEntry = 0

        for (i in cart.keys) {
            if (product == i) {
                newEntry++
            }
        }
        cart.put(product+"_$newEntry", amount)

    } else {
        cart.put(product, amount)
    }

}


fun checkOut() {

    for (items in cart) {
        println("PRODUCT: ${items.key} AMOUNT: ${items.value}")
    }
    println("TOTAL AMOUNT: ${cart.values.sum()}")

}

fun removeFromCart(item: String) {

    if (cart.contains(item)) {
        cart.remove(item)
    }
}