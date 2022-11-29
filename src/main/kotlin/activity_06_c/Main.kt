package activity_06_c

/*
When a customer checks out an item, identify the possible scenarios where a cart can not be checked out properly.

Name at least 5 scenarios.

Create a function that will check the cart for the exceptions.*/

val cart = hashMapOf<String, Double>()
val validVouchers = setOf<String>("10OFF", "20OFF", "30OFF", "35OFF")
val usedVouchers = setOf<String>("ABC123", "DEF456")
val expiredVouchers = setOf<String>("NEWYEAR2022", "VALENTINES2022")
var voucherCode = ""

fun main() {

    checkOut(cart, voucherCode)


}

fun checkOut(cart: HashMap<String, Double>, voucher: String){

    if (cart.isEmpty()) {
        throw Error.EmptyCart()
    }

    if (cart.containsValue(0.0)){
        throw Error.InvalidPrice()
    }

    if(usedVouchers.contains(voucher)){
        Error.Voucher.Used()
    }

    if(!validVouchers.contains(voucher)){
        throw Error.Voucher.NotValid()
    }

    if(expiredVouchers.contains(voucher)){
        throw Error.Voucher.Expired()
    }
}


sealed class Error(message: String): Exception(message) {

    class EmptyCart(message: String = "Cart should not be empty"): Error(message)
    class InvalidPrice(message: String = "Price should not be zero"): Error(message)

    sealed class Voucher(message: String): Error(message){
        class Expired(message: String = "Voucher is expired"): Voucher(message)
        class NotValid(message: String = "Voucher doesn't exist"):Voucher(message)
        class Used(message: String = "Voucher is already used"):Voucher(message)
    }
}
