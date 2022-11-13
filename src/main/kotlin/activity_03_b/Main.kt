package activity_03_b

/*
Covered Topic(s) : Functions



Instructions :



1. Create an ArrayList of bookname with 20 entries.

2. Create a function "isBookInRecord" that will accept a String and return true if the book is found, otherwise false.

3. Create a function "addBook" that will accept a String and add it to the ArrayList.

4. Create a function "removeBook"  that will accept a name and remove it from the ArrayList if it exactly matches the book name.

5. Create a function "countBooks" that will return the size of the ArrayList.

6. Create a function "searchBookWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of books that matched if there are.

7. Create a function  "searchBookName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of books that matched if there are.

8.  Create a function "showBooks" that will print all the entries in the ArrayList.*/



val bookNames = arrayListOf<String>(
    "Duchess Of Eternity",
    "Priest Of Joy",
    "Doctors Of Destruction",
    "Bandits Of Sorrow",
    "Foes And Invaders",
    "Horses And Spiders",
    "Construction Without Shame",
    "Ruins With Pride",
    "Answering The Ships",
    "Eliminating The Swamp",
    "Mouse Of The East",
    "Guardian With Honor",
    "Mice Of The Sea",
    "Lions Of The Light",
    "Pilots And Creators",
    "Wives And Girls",
    "Perfection Of The West",
    "Chase Of Silver",
    "Drinking At The Night",
    "Blinded By The Forest"
)

fun main() {

    println(isBookInRecord("Priest Of Joy"))
    println(searchBookWildSearch("and"))
    println(searchBookName("wives and girls"))
    showBooks()

}

fun isBookInRecord(book: String): Boolean {

    return bookNames.contains(book)

}


fun addBook(book: String) {

    bookNames.add(book)

}


fun removeBook(book: String) {

    bookNames.remove(book)

}


fun countBooks(): Int {

    return bookNames.size

}


fun searchBookWildSearch(str : String): ArrayList<String> {

    val wildSearch = ArrayList<String>()

    for (item in bookNames) {

        if (item.contains(str, true)) {
            wildSearch.add(item)
        }
    }

    return wildSearch

}

fun searchBookName(book: String): ArrayList<String> {

    val searchBook = ArrayList<String>()

    for (item in bookNames) {

        if (item.contentEquals(book, true)) {
            searchBook.add(item)
        }
    }

    return searchBook

}


fun showBooks() {
    println(bookNames)
}