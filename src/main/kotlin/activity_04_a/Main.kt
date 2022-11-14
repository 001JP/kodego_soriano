package activity_04_a

import javax.naming.Name

/*
Covered Topic(s) : Classes


Instructions :

1. Use class to represent the student rather string.Make sure the student has a firstName, lastName, nickName, id and year enrolled

2. Update the searchStudentWildSearch to search for the wild string in the lastname, middle name, and firstname.

Return the Arraylist of students that match the searched string, if there are no entries return an empty ArrayList.

3. Add a function searchStudentWildSearch that will accept a string and either of the following values, lastname, middleName, nickname.

This will search the specific wild string depending where it was mentioned to be searched for.

Return the Arraylist of students that match the searched string, if there are no entries return an empty ArrayList.*/




data class Names(val firstName: String, val lastName: String, val nickName: String, val id: Int, val yearEnrolled: Int)


val studentNames : ArrayList<Names> = arrayListOf()


fun main() {

    addStudentNames()

    println(searchStudentWildSearch("Z"))

}



fun addStudentNames() {

    studentNames.add(Names("John", "Soriano", "JP", 1000, 2022))
    studentNames.add(Names("Reilly", "Rose", "Reilly", 1001, 2022))
    studentNames.add(Names("Marin", "Cisneros", "Marin", 1002, 2022))
    studentNames.add(Names("Justine", "Willis", "Justin", 1003, 2022))
    studentNames.add(Names("Maria", "Alvarez", "Maria", 1004, 2022))

}






fun searchStudentWildSearch(str : String): ArrayList<String> {

    val wildSearch = ArrayList<String>()

    for (data in studentNames) {

        if (data.firstName.contains(str, true)) {
            wildSearch.add(data.toString())
        } else if (data.lastName.contains(str, true)) {
            wildSearch.add(data.toString())
        } else if (data.nickName.contains(str, true)) {
            wildSearch.add(data.toString())
        }

    }

    return wildSearch
}