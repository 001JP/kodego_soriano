package activity_05_b

/*
Covered Topic(s) : OOP

1. A book, a magazine, a newspaper and comics inherits from a Publication class. Identify the attributes and the methods for the publication.

2. There are several Audio / Video materials, Recordings, Documentary, Movies and powerpoint materials.
What will you use to present the different types of Audio / Video presentation, a class or an enum? Why?
Implement your answer in code.

3. Authors and Illustrators seem to have similar data? What will you use to present the two a class or an enum or will you keep them as is? Why?
Implement your answer in code.
*/

open class Publication(
    val title: String,
    val AuthorsAndEditors: String,
    val yearPublished: Int,
    val edition: Int,
    val ISBN: Long,
    val publisher: Int ) {

    fun printMaterials(){
        println("Printing Materials")
    }

    fun distribute(){
        println("Distributing Materials")
    }

    fun advertise(){
        println("Posting ads")
    }

}

enum class MaterialType(){
    AUDIO,
    VIDEO,
    RECORDINGS,
    DOCUMENTARY,
    MOVIE,
    POWERPOINT
}

open class Writer(firstName: String, middleName: String, lastName: String, dateOfBirth: String)

class Author(firstName: String, middleName: String, lastName: String, dateOfBirth: String
): Writer(firstName, middleName, lastName, dateOfBirth)

class Illustrator(firstName: String, middleName: String, lastName: String, dateOfBirth: String
): Writer(firstName, middleName, lastName, dateOfBirth)