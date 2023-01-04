import activity_07_c.Cart
import activity_07_c.CartError
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class Activity07C {

    private val cart = Cart()

    @Test
    fun amountIsZero(){

        assertThrows<CartError.ItemIsEmpty> {
            cart.addToCart("", 0.0)
        }

        assertThrows<CartError.AmountIsInvalid> {
            cart.addToCart("Item", 0.0)
        }

        assertThrows<CartError.CartIsEmpty> {
            cart.checkOut(arrayListOf(), arrayListOf(), arrayListOf())
        }
    }

}