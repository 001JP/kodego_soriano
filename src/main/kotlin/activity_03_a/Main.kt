package activity_03_a

/*Covered Topic(s) : Functions

Instructions :

Note: Names are single word with no spaces example, "Marco", "Eugene", "Sarah", "Isaiah", "Anthony", "Henry".

1. Create an ArrayList of names with 20 entries.

2. Create a function "isStudentInRecord" that will accept a name and return true if the name is found, otherwise false.

3. Create a function "addStudent" that will accept a name and add it to the ArrayList.

4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.

5. Create a function "countStudent" that will return the size of the ArrayList.

6. Create a function "searchStudentWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of names that matched if there are.

7. Create a function  "searchStudentName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of names that matched if there are.

8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if the String input is less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.

9.  Create a function "showStudents" that will print all the entries in the ArrayList.*/




var  studentNames = arrayListOf<String>(
    "Marco", "Eugene", "Sarah", "Isaiah", "Anthony", "Henry", "Kim", "Rice", "Cole", "Castillo",
    "Rogers", "Cox", "Lee", "Gutierrez", "Stone", "Anderson", "Lawrence", "Campbell", "Williams", "Hudson"
)




fun main() {

    showStudents()

}


fun isStudentInRecord(name : String): Boolean {

    return studentNames.contains(name)

}


fun addStudent(name : String) {

    studentNames.add(name)

}


fun removeStudent(name : String) {

    studentNames.remove(name)

}


fun countStudent(): Int {

    return studentNames.size

}


fun searchStudentWildSearch(str : String): ArrayList<String> {

    val wildSearch = ArrayList<String>()

    for (name in studentNames) {

        if (name.contains(str, true)) {
            wildSearch.add(name)
        }

    }

     return wildSearch
}


fun searchStudentName(name: String): ArrayList<String> {

    val searchStudent = ArrayList<String>()

    for (name in studentNames) {

        if (name.contentEquals(name, true)) {
            searchStudent.add(name)
        }
    }

    return searchStudent
}


fun searchStudent(name: String) {

    if (name.length <= 3) {
        searchStudentWildSearch(name)
    } else {
        searchStudentName(name)
    }

}

fun showStudents() {
    println(studentNames)
}
