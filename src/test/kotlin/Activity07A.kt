import activity_06_a.CheckGrades
import activity_06_a.GradeErrors
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

/*Create a unit test to check if the function created in Activity 06 - A Exception will produce the expected behaviors.

Add the following functionalities for Grade Checking

It will get the average of the array

if average is

≥ 94 grade is 4.0
≥ 89 grade is 3.5
≥ 83 grade is 3.0
≥ 78 grade is 2.5
≥ 72 grade is 2.0
≥ 66 grade is 1.5
≥ 60 grade is 1.0
< 60 grade is 0.0

Note :
the array should only contain values 0.0 .. 100
the array can only contain 10 entries


create unit tests to validate the behavior of function for checking grade*/

class Activity07A {

    private val gradeChecker = CheckGrades()

    @Test
    fun checkGradeInput(){

        assertThrows<GradeErrors.InvalidLength> {
            gradeChecker.gradeChecker(arrayOf(84, 80, 90, 85, 86, 82))
        }

        assertThrows<GradeErrors.InvalidInput> {
            gradeChecker.gradeChecker(arrayOf())
        }

        assertThrows<GradeErrors.InvalidInput> {
            gradeChecker.gradeChecker(arrayOf(101, -85, 95, 84, 84, 90, 90, 93, 95, 90))
        }

    }


}