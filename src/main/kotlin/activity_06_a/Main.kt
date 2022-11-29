package activity_06_a

/*
Using Activity 05 A

Create a function that will check the student's grade.

The function will accept an array with 10 entries only. It will throw the following exceptions

if the array size is greater than 10 throw invalid input

if the array contains 0 throw incomplete grades*/

fun main(){

    checkStudentGrades(arrayOf())
    checkStudentGrades(arrayOf(10, 20, 30, 40, 50))

}

fun checkStudentGrades(grades: Array<Int>){

    if (grades.isEmpty()) {
        throw CheckGrades.IncompleteGrades()
    }

    if (grades.size < 10) {
        throw CheckGrades.InvalidLength()
    }

}

sealed class CheckGrades(message: String): Exception(message){

    class InvalidLength(message: String = "Grade size should be greater than 10"): CheckGrades(message)
    class IncompleteGrades(message: String = "Grade should not be empty"): CheckGrades(message)
}
