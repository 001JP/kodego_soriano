package activity_06_a

/*
Using Activity 05 A

Create a function that will check the student's grade.

The function will accept an array with 10 entries only. It will throw the following exceptions

if the array size is greater than 10 throw invalid input

if the array contains 0 throw incomplete grades*/

fun main(){
    val checkGrades = CheckGrades()

    //checkGrades.gradeChecker((arrayOf()))
    checkGrades.gradeChecker(arrayOf(101, 87, 84, 85, 85, 86, 87, 90, 90, 91))

}

class CheckGrades(){
    fun gradeChecker(gradesInput: Array<Int>){

        gradesInput.forEach {grade ->
            if(grade !in 0..100){
                throw GradeErrors.InvalidInput("$grade Grade should be 0 to 100")
            }
        }

        if (gradesInput.isEmpty()) {
            throw GradeErrors.InvalidInput()
        }
        if (gradesInput.size < 10) {
            throw GradeErrors.InvalidLength()
        }

        val average = getAverage(gradesInput)
        println("Average $average")
        println("Grade ${getFinalGrade(average)}")

    }

    private fun getAverage(grades: Array<Int>): Int{
        return grades.average().toInt()
    }

    private fun getFinalGrade(average: Int): Float{

        var grade : Float = 0F

        when{
            average >= 94 -> {
                grade = 4.0F
            }
            average >= 89 -> {
                grade = 3.5F
            }
            average >= 83 -> {
                grade = 3.0F
            }
            average >= 78 -> {
                grade = 2.5F
            }
            average >= 72 -> {
                grade = 2.0F
            }
            average >= 66 -> {
                grade = 1.5F
            }
            average >= 60 -> {
                grade = 1.0F
            }
        }
        return grade
    }

}

sealed class GradeErrors(message: String): Exception(message){

    class InvalidLength(message: String = "Grade size should be greater than 10"): GradeErrors(message)
    class InvalidInput(message: String = "Grade should not be empty"): GradeErrors(message)
}
