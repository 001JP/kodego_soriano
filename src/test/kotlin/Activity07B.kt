import activity_06_b.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

/*Create the unit test for Activity 06 - B Exceptions

Note :

Make sure all the scenarios for borrowing from the library will be covered.*/


class Activity07B {

    private val user1: BorrowForm = BorrowForm(
        User("Juan",
            "Santos",
            "Dela Cruz",
            arrayListOf("Book1"),
            false),
        "Book67",
        CheckItem.AVAILABLE)

    private val library = Library()

    @Test
    fun test(){
        user1.user.itemsBorrowed.addAll(listOf("Book2", "Book3", "Book4", "Book5"))
        assertThrows<CanNotBorrow.User.TooManyItemsBorrowed> {
            library.check(user1)
        }

        user1.user.itemsBorrowed.clear()
        user1.user.unpaidDues = true
        assertThrows<CanNotBorrow.User.UnpaidDues> {
            library.check(user1)
        }
        user1.user.unpaidDues = false

        user1.itemStatus = CheckItem.RESERVED
        assertThrows<CanNotBorrow.Item.Reserved> {
            library.check(user1)
        }

        user1.itemStatus = CheckItem.FIXING
        assertThrows<CanNotBorrow.Item.Fixing> {
            library.check(user1)
        }

        user1.itemStatus = CheckItem.INTERNAL_USE
        assertThrows<CanNotBorrow.Item.InternalUse> {
            library.check(user1)
        }

    }








}