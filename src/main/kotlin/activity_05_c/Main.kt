package activity_05_c

import activity_03_c.addToCart
import activity_03_c.products

/*

Covered Topic(s) : OOP

1. Create a parent class for all the products in the grocery.
2. Create a cart to store the groceries.
3. Create a Main class where you will add the Cart.
4. In the main class add the following functions
a - add to cart > add an item in the cart
b - remove from cart > remove item in the cart
c - check out cart > compute the total cost of the cart.*/

open class Products(val item: String?, val price: Double?)

val cart = hashMapOf<String, Double>()

class Main(item: String?, price: Double?):Products(item, price) {

    fun addToCart() {
        cart[item!!] = price!!
    }

    fun removeFromCart(item: String){
        cart.remove(item)
    }

    fun checkOutCart(): Double{
        var total = 0.0

        for (amount in cart.values) {
            total += amount
        }

        return total
    }
}

fun main() {

    var item1 = Main("Apple", 10.5).addToCart()
    var item2 = Main("Orange", 5.0).addToCart()
    var remove = Main(null, null).removeFromCart("Orange")
    var item3 = Main("Banana", 5.0).addToCart()
    var total = Main(null, null).checkOutCart()

    println("CART: ${cart.toString()}")
    println("TOTAL: $total")
}
