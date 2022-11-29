package activity_06_b

import kotlin.Exception

/*Create a function that will accept an item in the library and person who will borrow the item, (Use classes in Activity 05 - B).
Throw the following exceptions :

if the user still has 5 or more items from the library - Cannot borrow due to too many items still borrowed

if the user has unpaid dues - Cannot borrow Exception due to unpaid dues

if the item being borrowed has been reserved - Cannot borrow due to reserved

it the item is for internal use - Cannot borrow due to item only used in library

if the item is for fixing - Cannot borrow due to item needs to be fixed


You will need to add the remaining classes and add the remaining methods and attributes in order to implement the functionalities.*/

data class User(val firstName: String, val middleName: String, val lastName: String, val itemsBorrowed:ArrayList<String>, val unpaidDues: Boolean)

enum class CheckItem(){
    AVAILABLE,
    RESERVED,
    INTERNAL_USE,
    FIXING
}

class BorrowForm(val user: User, val itemToBorrow: String, val itemStatus: CheckItem)

fun main() {

    val user1 :BorrowForm= BorrowForm(
        User("Juan",
            "Santos",
            "Dela Cruz",
            arrayListOf("Book1", "Book2, Book3, Book4, Book5"),
            true),
        "Book6",
        CheckItem.RESERVED)

    libraryChecking(user1)

}

fun libraryChecking(borrowItem: BorrowForm){

    if(borrowItem.user.itemsBorrowed.size <= 5){
        throw CanNotBorrow.User.TooManyItemsBorrowed()
    }

    if(borrowItem.user.unpaidDues){
        throw CanNotBorrow.User.UnpaidDues()
    }

    if(borrowItem.itemStatus == CheckItem.RESERVED) {
        throw CanNotBorrow.Item.Reserved()
    }

    if(borrowItem.itemStatus == CheckItem.INTERNAL_USE){
        throw CanNotBorrow.Item.InternalUse()
    }

    if(borrowItem.itemStatus == CheckItem.FIXING){
        throw CanNotBorrow.Item.Fixing()
    }

}



sealed class CanNotBorrow(message: String): Exception(message){

    sealed class User(message: String): CanNotBorrow(message){
        class TooManyItemsBorrowed(message: String = "Cannot borrow more than 5 items"):User(message)
        class UnpaidDues(message: String = "Cannot borrow due to unpaid dues"):User(message)
    }

    sealed class Item(message: String): CanNotBorrow(message){
        class Reserved(message: String = "Item is borrowed"): Item(message)
        class InternalUse(message: String = "Item is only used in library"): Item(message)
        class Fixing(message: String = "Item is being fixed"): Item(message)
    }


}