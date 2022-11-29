package activity_07_c


/*
Create the unit test for adding items in the Cart as well as checking out the items in cart.*/

val cart = arrayListOf<String>()
val amount = arrayListOf<Double>()


class Cart(){

    fun addToCart(item: String, price: Double){

        if(item.isEmpty()){
            throw CartError.ItemIsEmpty("Item can not be empty")
        }
        if(price <= 0.0){
            throw CartError.AmountIsInvalid("Invalid amount")
        }

        if(item.isNotEmpty() && price > 0.0){
            cart.add(item)
            amount.add(price)
        }
    }

    fun checkOut(items: ArrayList<String>, prices: ArrayList<Double>, qty: ArrayList<Int>){

        if (items.isEmpty() || prices.sum() < 0){
            throw CartError.CartIsEmpty("Cart is empty")
        } else {
            println("ITEMS: $items, ")
        }


    }

}

sealed class CartError(message: String): Exception(message) {

    class ItemIsEmpty(message: String):CartError(message)
    class AmountIsInvalid(message: String):CartError(message)
    class CartIsEmpty(message: String):CartError(message)

}
